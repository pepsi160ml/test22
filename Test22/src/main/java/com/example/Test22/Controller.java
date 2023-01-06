package com.example.Test22;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {

    @GetMapping("/")
    public String hi() {
        return "To-do Application!";
    }
}
