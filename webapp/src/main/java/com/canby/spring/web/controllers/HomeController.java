package com.canby.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by acanby on 17/03/2015.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHome() {
        return "home";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String showParams(Model model, @RequestParam("id") String id) {
        model.addAttribute("id", id);
        return "home";
    }
}
