
package com.real.estate.service;

import com.real.estate.dto.PropertyDto;
import com.real.estate.entity.Property;
import com.real.estate.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Override
    public void addToFavorites(PropertyDto propertyDto) {
        Property property = convertToEntity(propertyDto);
        propertyRepository.save(property);
    }

    @Override
    public void setupPropertyAlerts(String location, Double price, String propertyType) {
        // Your code here
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
