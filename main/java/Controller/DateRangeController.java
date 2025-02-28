package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DateRangeController {

    @GetMapping("/")
    public String index() {
        return "index";  // Returns index.html
    }

    @GetMapping("/dataDisplay")
    public String dataDisplay() {
        return "dataDisplay";  // Returns dataDisplay.html
    }

}
