package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointsController {

    @GetMapping("/math/pi")
    public double getBasicValue() {
        return 3.141592653589793;
    }

    @GetMapping("/vehicles")
    public String getQueryParams(@RequestParam int year, @RequestParam int doors) {
        return "Vehicle year is" + " " + year + " and doors are" + " " + doors;
    }

   /* @GetMapping("/greetings/{first}/{last}")
    public String getQueryVariables(@RequestParam String first, @RequestParam String last) {
        return "Greetings" + " " + first + " " + last;
    }*/

}
