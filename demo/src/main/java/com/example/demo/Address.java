package com.example.demo;

import jakarta.persistence.Embeddable;


@Embeddable
public class Address {

    String city ;
    String country;

    
    
    public Address() {
    }

    public Address(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
