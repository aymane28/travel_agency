package fr.lernejo.travelsite.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TemperatureApp {

    private final String Country;
    private final List<Temp> temperatures;

    @JsonCreator
    public TemperatureApp(@JsonProperty("country") String country, List<Temp> temperatures) {
        Country = country;
        this.temperatures = temperatures;
    }

    public String getCountry() {
        return Country;
    }



    public List<Temp> getTemperatures() {
        return temperatures;
    }


}
