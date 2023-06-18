
package com.real.estate.controller;

import com.real.estate.dto.PropertyDto;
import com.real.estate.entity.Property;
import com.real.estate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/favorites")
    public void addToFavorites(@RequestBody PropertyDto propertyDto) {
        Property property = convertToEntity(propertyDto);
        userService.addToFavorites(property);
    }

    @PostMapping("/alerts")
    public void setupPropertyAlerts(@RequestParam String location, @RequestParam Double price, @RequestParam String propertyType) {
        userService.setupPropertyAlerts(location, price, propertyType);
    }

    private Property convertToEntity(PropertyDto propertyDto) {
        Property property = new Property();
        property.setId(propertyDto.getId());
        property.setType(propertyDto.getType());
        property.setLocation(propertyDto.getLocation());
        property.setPrice(propertyDto.getPrice());
        property.setImages(propertyDto.getImages());
        return property;
    }
}
