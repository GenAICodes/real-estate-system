
package com.real.estate.service;

import com.real.estate.entity.Property;
import com.real.estate.entity.PropertyReview;
import com.real.estate.entity.PropertyRating;

public interface PropertyService {
    Property listProperty(String type, String location, Double price, String images);
    PropertyRating rateProperty(Long propertyId, Integer rating);
    PropertyReview reviewProperty(Long propertyId, String comment);
}
