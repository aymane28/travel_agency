package fr.lernejo.travelsite.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Inscription {

    private final String userEmail;
    private final String userName;
    private final String userCountry;
    private final String weatherExpectation;
    private final Long minimumTemperatureDistance;
/*
    public Inscription(String userEmail, String userName, String userCountry, String weatherExpectation, Long minimumTemperatureDistance){
        this.userEmail = userEmail;
        this.userName = userName;
        this.userCountry = userCountry;
        this.weatherExpectation = weatherExpectation;
        this.minimumTemperatureDistance = minimumTemperatureDistance;
    }*/


    @JsonCreator
    public Inscription(@JsonProperty("userEmail") String userEmail, @JsonProperty("userName") String userName, @JsonProperty("userCountry") String userCountry, @JsonProperty("weatherExpectation") String weatherExpectation, @JsonProperty("minimumTemperatureDistance") Long minimumTemperatureDistance) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userCountry = userCountry;
        this.weatherExpectation = weatherExpectation;
        this.minimumTemperatureDistance = minimumTemperatureDistance;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getWeatherExpectation() {
        return weatherExpectation;
    }

    public Long getMinimumTemperatureDistance() {
        return minimumTemperatureDistance;
    }
}
