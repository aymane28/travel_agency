package fr.lernejo.travelsite.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Trav {

    private final String name;
    private final String temperature;

    @JsonCreator
    public Trav(@JsonProperty("name") String name, @JsonProperty("temperature") String temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public String getTemperature() {
        return temperature;
    }

}
