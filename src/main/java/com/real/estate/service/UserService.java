
package com.real.estate.service;

import com.real.estate.dto.PropertyDto;
import com.real.estate.repository.PropertyRepository;

public interface UserService {
    void addToFavorites(PropertyDto propertyDto);
    void setupPropertyAlerts(String location, Double price, String propertyType);
}
