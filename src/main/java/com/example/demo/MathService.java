package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathService {

    @GetMapping("/math/calculate")
    public String getQueryParams(@RequestParam String operation, @RequestParam int x, @RequestParam int y) {
        int z;
        if (operation.equals("add")) {
            z = x + y;
            return x + " + " + y + " = " + z;
        }

        if (operation.equals("subtract")) {
            z = x - y;
            return x + " - " + y + " = " + z;
        }

        if (operation.equals("multiply")) {
            z = x * y;
            return x + " * " + y + " = " + z;
        }

        if (operation.equals("divide")) {
            z = x / y;
            return x + " / " + y + " = " + z;
        } else
            z = x + y;
        return x + " + " + y + " = " + z;

    }

    @PostMapping("/math/sum")
    public String getSum(@RequestParam int... n) {
        int result=0;
        StringBuilder sb = new StringBuilder();
        for(int item:n) {
            result += item;
            sb.append(" " + item + " " + "+");
        }
        sb.deleteCharAt(sb.length() -1);
        return sb.toString() + "=" + " " + String.valueOf(result);
    }
}