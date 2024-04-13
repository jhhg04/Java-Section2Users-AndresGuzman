package com.example.demo.controllers;

import com.example.demo.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("John", "Herrera");
        user.setEmail("john@mail.com");

        model.addAttribute("title", "Details Page");
        model.addAttribute("titlePage", "Hello World From UserController");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("title", "Listado de Usuarios");
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
        return Arrays.asList(
                new User("Pepa", "Gonzalez"),
                new User("Lalo", "Landa", "lalo@mail.com"),
                new User("Juana", "Perez", "juana@mail.com"),
                new User("Andres", "Gomez")
        );
    }
}

