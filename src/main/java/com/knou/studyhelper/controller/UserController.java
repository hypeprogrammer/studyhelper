package com.knou.studyhelper.controller;

import com.knou.studyhelper.entity.User;
import com.knou.studyhelper.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String showMainPage() {
        log.info("showMainPage");
        return "index";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        log.info("showLoginPage");
        return "login";
    }

    @GetMapping("/register")

    public String showRegisterPage() {
        log.info("register Get Method");
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        log.info("register Post Method");
        userService.saveUser(user);
        return "redirect:/";
    }
}
