package fr.lernejo.prediction;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.format.annotation.DateTimeFormat;

public class Temp {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private final String date;
    private final Double temperature;

    @JsonCreator
    public Temp(@JsonProperty("date") String date, @JsonProperty("temperature") Double temperature) {
        this.date = date;
        this.temperature = temperature;
    }
/*
    public Temp(String date, Double temperature) {
        this.date = date;
        this.temperature = temperature;
    }*/


    public String getDate() {
        return date;
    }



    public Double getTemperature() {
        return temperature;
    }

}
