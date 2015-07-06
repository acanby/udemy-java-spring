package com.canby.spring.web.controllers;

import com.canby.spring.web.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by acanby on 1/06/2015.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }

    @RequestMapping("/newAccount")
    public String newAccount(Model model) {
        model.addAttribute("user", new User());
        return "newAccount";
    }

    @RequestMapping("/createAccount")
    public String createAccount() {
        return "accountCreated";
    }
}
