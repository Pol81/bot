package ru.positiveteam.telegram.bot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultRestController {

    @GetMapping("/test")
    public String getTestData() {
        return "Hello from Pol`s server!";
    }
}
