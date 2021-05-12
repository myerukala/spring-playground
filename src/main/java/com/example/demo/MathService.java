package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathService {

    int z;
    @GetMapping("/math/calculate")
    public String getQueryParams(@RequestParam String operation, @RequestParam int x, @RequestParam int y) {
        if(operation.equals("add")) {
            z = x + y;
            return x + " + " + y + " = " + z;
        }

        if(operation.equals("subtract")) {
            z = x - y;
            return x + " - " + y + " = " + z;
        }

        if(operation.equals("multiply")) {
            z = x * y;
            return x + " * " + y + " = " + z;
        }

        if(operation.equals("divide")) {
            z = x / y;
            return x + " / " + y + " = " + z;
        }
        else
            z = x + y;
        return x + " + " + y + " = " + z;

    }
}
