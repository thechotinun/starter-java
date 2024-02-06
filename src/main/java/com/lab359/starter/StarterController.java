package com.lab359.starter;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class StarterController {
    @RequestMapping("/")
    public String index() {
        return "Hello world";
    }
}
