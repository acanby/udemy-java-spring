package com.canby.spring.web.controllers;

import org.springframework.stereotype.Controller;
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
}
