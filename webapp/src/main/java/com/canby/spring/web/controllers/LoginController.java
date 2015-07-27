package com.canby.spring.web.controllers;

import com.canby.spring.web.dao.User;
import com.canby.spring.web.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by acanby on 1/06/2015.
 */
@Controller
public class LoginController {

    private final UsersService usersService;

    @Autowired
    public LoginController(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }

    @RequestMapping("/newAccount")
    public String newAccount(Model model) {
        model.addAttribute("user", new User());
        return "newAccount";
    }

    @RequestMapping(value = "/createAccount", method = RequestMethod.POST)
    public String createAccount(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("Form does not validate");
            bindingResult.getAllErrors().stream().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
            return "newAccount";
        }

        user.setEnabled(true);
        user.setAuthority("user");

        if (usersService.exists(user.getUsername())) {
            bindingResult.rejectValue("username", "user.username", "Username taken! Try another.");
            return "newAccount";
        }

        usersService.create(user);

        return "accountCreated";
    }

    @RequestMapping("/loggedOut")
    public String showLogout() {
        return "loggedOut";
    }
}
