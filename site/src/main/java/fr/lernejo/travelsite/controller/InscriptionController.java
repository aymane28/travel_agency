package fr.lernejo.travelsite.controller;

import fr.lernejo.travelsite.Service.SiteService;
import fr.lernejo.travelsite.model.Inscription;
import fr.lernejo.travelsite.model.Travels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;


@RestController
public class InscriptionController {
    @Autowired
    private final SiteService siteService;
    private final Inscription inscription = null;
    public InscriptionController(SiteService siteService) {
        this.siteService = siteService;

    }

    @PostMapping("/api/inscription")
    @ResponseBody
    public Inscription createProduct(@RequestBody Inscription inscription) {
        /*JSONObject obj = new JSONObject();
        FileWriter  file = null;
        obj.put("userEmail", inscription.getUserEmail());
        obj.put("userName", inscription.getUserName());
        obj.put("userCountry", inscription.getUserCountry());
        obj.put("weatherExpectation", inscription.getWeatherExpectation());
        obj.put("minimumTemperatureDistance", inscription.getMinimumTemperatureDistance());
        try {
             file = new FileWriter("site/src/main/resources/json/inscription.json");
            file.write(obj.toJSONString());
        } catch (IOException e) {e.printStackTrace();}
                try {file.close();
            } catch (IOException e) {e.printStackTrace();}/*/
        return inscription;
}


   @GetMapping("/api/travels")
    public ArrayList<Travels> getTravels(@RequestParam(value = "userName") String userName) throws Exception {
        //return siteService.getTravels();
       Travels tra= new Travels("France", 24.2);
       ArrayList<Travels> travels= new ArrayList<>();
       travels.add(tra);
       return travels;
    }
}
