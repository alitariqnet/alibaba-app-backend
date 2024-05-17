package com.AlHassanElectronics.Software.config;

import com.AlHassanElectronics.Software.Pojo.ErrorResponse;
import com.AlHassanElectronics.Software.exception.CustomAuthenticationException;
import com.AlHassanElectronics.Software.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final String username = authentication.getName();
        final String password = authentication.getCredentials().toString();
        Optional<com.AlHassanElectronics.Software.entity.User> user = userRepository.findByUsername(username);

        if (user.isPresent() && (!user.get().getUsername().equals(username) || !user.get().getPassword().equals(password))) {
            throw new CustomAuthenticationException("Cannot authenticate, username or password is incorrect");
        }
        return authenticateAgainstThirdPartyAndGetAuthentication(username, password);
    }

    private static UsernamePasswordAuthenticationToken authenticateAgainstThirdPartyAndGetAuthentication(String name, String password) {
        final List<GrantedAuthority> grantedAuths = new ArrayList<>();
        grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
        final UserDetails principal = new User(name, password, grantedAuths);
        return new UsernamePasswordAuthenticationToken(principal, password, grantedAuths);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleAuthenticationException(AuthenticationException ae){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setErrorCode("400");
//        errorResponse.setException(ae);
        errorResponse.setId(2);
        errorResponse.setMessage("Authentication Exception, request unauthorized");
        return new ResponseEntity<>(errorResponse, HttpStatus.FORBIDDEN);
    }
}
