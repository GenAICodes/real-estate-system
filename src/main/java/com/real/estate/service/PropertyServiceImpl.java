
package com.real.estate.service;

import com.real.estate.entity.Property;
import com.real.estate.entity.PropertyRating;
import com.real.estate.entity.PropertyReview;
import com.real.estate.repository.PropertyRatingRepository;
import com.real.estate.repository.PropertyRepository;
import com.real.estate.repository.PropertyReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    @Autowired
    private PropertyRatingRepository propertyRatingRepository;

    @Autowired
    private PropertyReviewRepository propertyReviewRepository;

    @Override
    public Property listProperty(String type, String location, Double price, String images) {
        Property property = new Property();
        property.setType(type);
        property.setLocation(location);
        property.setPrice(price);
        property.setImages(images);
        return propertyRepository.save(property);
    }

    @Override
    public PropertyRating rateProperty(Long propertyId, Integer rating) {
        PropertyRating propertyRating = new PropertyRating();
        propertyRating.setPropertyId(propertyId);
        propertyRating.setRating(rating);
        return propertyRatingRepository.save(propertyRating);
    }

    @Override
    public PropertyReview reviewProperty(Long propertyId, String comment) {
        PropertyReview propertyReview = new PropertyReview();
        propertyReview.setPropertyId(propertyId);
        propertyReview.setComment(comment);
        return propertyReviewRepository.save(propertyReview);
    }
}
