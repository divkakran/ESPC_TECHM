package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class welcomeController {

    @RequestMapping(
            value = "/welcome/{name}",
            method = RequestMethod.GET
    )
    @ResponseBody
    public String responseEntity(@PathVariable String name) {
        return "Hello "+ name;
    }
}
