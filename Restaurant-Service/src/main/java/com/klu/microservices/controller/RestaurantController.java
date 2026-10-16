
package com.klu.microservices.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

    @GetMapping("/restaurant")
    public Map<String, String> getRestaurant() {
        return Map.of(
            "service", "Restaurant Service",
            "status", "Running"
        );
    }
}
