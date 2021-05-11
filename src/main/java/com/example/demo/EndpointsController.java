package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointsController {

    @GetMapping("/math/pi")
    public double getBasicValue() {
        return 3.141592653589793;
    }

}