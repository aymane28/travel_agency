package fr.lernejo.travelsite.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Travels {

    private final String country;
    private final Double temperature;

    @JsonCreator
    public Travels(@JsonProperty("country") String country,@JsonProperty("temperature") Double temperature) {
        this.country = country;
        this.temperature = temperature;
    }

    public String getCountry() {
        return country;
    }

    public Double getTemperature() {
        return temperature;
    }

}
