package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeleteController {
    @GetMapping("/")
    public String viewHomePage() {
        return "home";
    }
    @GetMapping("/")
    public String ooooo() {
        return "home";
    }

}
