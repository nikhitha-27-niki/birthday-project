package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BirthdayController {

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/wish")
    public String validateLogin(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {

        String correctName = "chirki";   // CHANGE THIS
        String correctPass = "2711";     // CHANGE THIS

        if(username.equalsIgnoreCase(correctName) 
                && password.equals(correctPass)){
            return "wish";
        } else {
            model.addAttribute("error",
                    "Wrong nickname or secret code 💔");
            return "login";
        }
    }

    @GetMapping("/memories")
    public String memories() {
        return "memories";
    }

    @GetMapping("/logout")
    public String logout() {
        return "login";
    }
}