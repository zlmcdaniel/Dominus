package com.sdd.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @GetMapping("/renter")
    public String createAccount( Model model ) {
        model.addAttribute("renter", new Renter());
        return "createaccount";
    }

    @PostMapping("/renter")
    public String createAccountSubmit(@ModelAttribute Renter renter, Model model) {
        model.addAttribute("renter", renter);
        return "newaccount";
    }

    @GetMapping("/user/Bob")
    public String user( Model model ) {
        return "userprofile";
    }


}
