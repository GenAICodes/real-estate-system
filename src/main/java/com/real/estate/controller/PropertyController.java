
package com.real.estate.controller;

import com.real.estate.entity.Property;
import com.real.estate.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @PostMapping("/list")
    public Property listProperty(@RequestParam String title, @RequestParam String description, @RequestParam String type, @RequestParam String location, @RequestParam double price, @RequestParam String images) {
        return propertyService.listProperty(title, description, type, location, price, images);
    }

    @PostMapping("/rate")
    public void rateProperty(@RequestParam Long id, @RequestParam int rating) {
        propertyService.rateProperty(id, rating);
    }

    @PostMapping("/review")
    public void reviewProperty(@RequestParam Long id, @RequestParam String review) {
        propertyService.reviewProperty(id, review);
    }
}
