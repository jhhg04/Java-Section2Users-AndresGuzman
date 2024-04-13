package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.models.dto.UserDto;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        User user = new User("John", "Herrera");
        UserDto userDto = new UserDto();
        userDto.setTitle("Hello World Api Rest");
        userDto.setUser(user);

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("John", "Herrera");
        User user2 = new User("Harold", "Guateque");
        User user3 = new User("Edwin", "Guzman");

        List<User> users = Arrays.asList(user, user2, user3);
//        List<User> users = new ArrayList<>();
//        users.add( user);
//        users.add( user2);
//        users.add( user3);

        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("John", "Herrera");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello World Api Rest");
        body.put("user", user);

        return body;
    }
}
