package com.pluralsight.NorthwindTradersAPI.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(@RequestParam(defaultValue = "World") String country) {
        return "Hello " + country + "!";
    }
}
