package com.AlHassanElectronics.Software.service;

import com.AlHassanElectronics.Software.entity.User;
import com.AlHassanElectronics.Software.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service(value = "userService")
public class UserService {

    private final UserRepository userRepository;
    private static int number = 10;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String username, String password, String firstName, String lastName, String phone, String email, String address, String city, String state, String country) {
        User user = new User(username , firstName, lastName, email, phone, address, city, state, country);
        user.setPassword(password);
//        user.setPassword(new BCryptPasswordEncoder().encode(password));
        log.info("Saving a new user..." + user);
        return userRepository.save(user);
    }

    public Optional<User> getUser(Long id) {
        Optional<User> user = Optional.empty();
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
