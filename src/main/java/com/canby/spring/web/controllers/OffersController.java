package com.canby.spring.web.controllers;

import com.canby.spring.web.dao.Offer;
import com.canby.spring.web.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by acanby on 5/03/2015.
 */
@Controller
public class OffersController {

    private final OffersService offersService;

    @Autowired
    public OffersController(OffersService offersService) {
        this.offersService = offersService;
    }

    @RequestMapping("/offers")
    public String showOffers(Model model) {
        List<Offer> offers = offersService.getCurrent();
        model.addAttribute("offers", offers);

        return "offers";
    }

    @RequestMapping("/createOffer")
    public String createOffer() {
        return "createOffer";
    }

    @RequestMapping(value = "/doCreate", method = RequestMethod.POST)
    public String doCreate(Model model, @Valid Offer offer, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("Form does not validate");
            bindingResult.getAllErrors().stream().forEach(objectError -> System.out.println(objectError.getDefaultMessage()));
        } else {
            System.out.println("Form validated");
        }

        return "offerCreated";
    }

}
