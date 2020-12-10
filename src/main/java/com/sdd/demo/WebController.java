package com.sdd.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    @GetMapping("/createaccount")
    public String createAccount( Model model ) {
        return "createaccount";
    }

    @GetMapping("/user/Bob")
    public String user( Model model ) {
        return "userprofile";
    }


}
