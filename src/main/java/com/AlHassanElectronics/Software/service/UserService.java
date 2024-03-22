package com.AlHassanElectronics.Software.service;

import com.AlHassanElectronics.Software.Pojo.ErrorResponse;
import com.AlHassanElectronics.Software.entity.User;
import com.AlHassanElectronics.Software.exception.GeneralException;
import com.AlHassanElectronics.Software.repository.UserRepository;
import com.sun.mail.iap.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service(value = "userService")
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name, String phone, String email, String address) {
        User user = new User(name, email, phone, address);
        log.info("Saving a new user..." + user);
        return userRepository.save(user);
    }

    public Optional<User> getUser(Long id) throws GeneralException {
        Optional<User> user = null;
        try {
            log.info("Retrieving a user...");
            user = userRepository.findByIdAndIsActiveTrue(id);
        } catch (Exception ex) {
            log.error("Exception occurred in UserService in getUser method");
        }
        return user;
    }

    public List<User> getUsers() {
        log.info("Retrieving all users...");
        return userRepository.findAll();
    }

    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }


}
