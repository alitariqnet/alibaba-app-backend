package com.AlHassanElectronics.Software.mapper;

import com.AlHassanElectronics.Software.Pojo.UserDto;
import com.AlHassanElectronics.Software.entity.User;

public class ObjectMapper {
    public static UserDto userToUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setAddress(user.getAddress());
        userDto.setCity(user.getCity());
        userDto.setState(user.getState());
        userDto.setCountry(user.getCountry());
        userDto.setAge(user.getAge());
        userDto.setGender(user.getGender());
        userDto.setEmail(user.getEmail());
        userDto.setCreatedOn(user.getCreatedOn());
        userDto.setActive(user.isActive());
        return userDto;
    }
}
