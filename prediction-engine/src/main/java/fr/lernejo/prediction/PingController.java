package fr.lernejo.prediction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    @Autowired
    private final TemperatureService temperatureService;

    @Autowired
    private final PredictionService predictionService;

    public PingController(TemperatureService temperatureService, PredictionService predictionService) {
        this.temperatureService = temperatureService;
        this.predictionService = predictionService;
    }

    @GetMapping(path = "/api/ping")
    String ping() {
        return "OK";
    }

    @GetMapping("/api/temperature")
    public Temperature getTravels(@RequestParam(value = "country") String country){
      Temperature temperature= new Temperature(country, predictionService.temperature(country));

        return temperature;
    }

    /*
@GetMapping("/api/temperature")
public Double getTravels(@RequestParam(value = "country") String country){
   // return new Temperature("France",  Arrays.asList(new Temp[]{new Temp("mama", 45L)}));
    temperatureService.getTemperature(country))})
    System.out.println(country);
    return new Temperature(country, Arrays.asList(new Temp[]{new Temp("ppo", );
    */

}


