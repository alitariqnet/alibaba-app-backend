package com.AlHassanElectronics.Software.controller;

import com.AlHassanElectronics.Software.Pojo.ErrorResponse;
import com.AlHassanElectronics.Software.Pojo.UserDto;
import com.AlHassanElectronics.Software.entity.User;
import com.AlHassanElectronics.Software.exception.GeneralException;
import com.AlHassanElectronics.Software.exception.ObjectNotFoundException;
import com.AlHassanElectronics.Software.mapper.ObjectMapper;
import com.AlHassanElectronics.Software.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("create")
    public ResponseEntity<User> createUser(@RequestParam String username, @RequestParam String password, @RequestParam String firstName, @RequestParam String lastName, @RequestParam String phone, @RequestParam String email, @RequestParam String address, @RequestParam String city, @RequestParam String state, @RequestParam String country) {
        return new ResponseEntity<User>(userService.createUser(username, password, firstName, lastName, phone, email, address, city, state, country), HttpStatus.OK);
    }

    @GetMapping("user")
    public ResponseEntity<UserDto> getUser(@Validated @RequestParam Long id) throws GeneralException {
        Optional<User> user = null;
        try {
            user = userService.getUser(id);
            if (!user.isPresent()) {
                throw new ObjectNotFoundException("User does not exist.");
            }
        } catch (Exception ex) {
            throw new GeneralException(ex);
        }

        UserDto userDto = ObjectMapper.userToUserDto(user.get());
        return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
    }

    @GetMapping("users")
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<List<User>>(userService.getUsers(), HttpStatus.OK);
    }
    @GetMapping("users/v2")
    public List<User> getUsersV2() {
        return userService.getUsers();
    }
    @DeleteMapping("user")
    public ResponseEntity<String> deleteUser(@RequestParam Long id) {
        return new ResponseEntity<String>(("User with id " + id + " deleted"), HttpStatus.OK);
    }
    // ExceptionHandler inside controller example
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleGeneralException(GeneralException ex){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(ex.getMessage() != null ? ex.getMessage() : "Error occurred during processing request");
        errorResponse.setId(0);
        errorResponse.setErrorCode("400");
        return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
