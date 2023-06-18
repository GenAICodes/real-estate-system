
package com.real.estate.entity;

import javax.persistence.*;

@Entity
@Table(name = "property_reviews")
public class PropertyReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long propertyId;
    private String comment;

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
