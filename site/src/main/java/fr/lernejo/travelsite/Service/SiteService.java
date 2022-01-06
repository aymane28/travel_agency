package fr.lernejo.travelsite.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

//import fr.lernejo.prediction.TemperatureService;
import fr.lernejo.travelsite.PredictionEngineClient;
import fr.lernejo.travelsite.model.Inscription;
import fr.lernejo.travelsite.model.Travels;
import org.springframework.stereotype.Service;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class SiteService {


   // private final PredictionEngineClient predictionEngineClient;

    //public final TemperatureService temperatureService= new TemperatureService();

    /*public SiteService(PredictionEngineClient predictionEngineClient) {
        this.predictionEngineClient = predictionEngineClient;
    }*/

    public List<String> ReadFileContries(String path) {
        //Stream<String> result = null;
        List<String> resultList=null;
        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            resultList = lines.collect(Collectors.toList());
        }catch (IOException e) {
            e.printStackTrace();
        }
        //read file into stream, try-with-resources
        /*try (Stream<String> stream = Files.lines(Paths.get(path))) {
            result = stream;
            result.forEach(x-> System.out.println(x));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        return resultList;
    }
   /* public Double getTemperature(String country) {
        return temperatureService.getTemperature(country);
    }*/
    public Inscription ReadInFileJson() throws Exception {
            ObjectMapper objectMapper = new ObjectMapper();
        Inscription inscription = objectMapper.readValue(new File("site/src/main/resources/json/inscription.json"), Inscription.class);

        return inscription;
    }
    public ArrayList<Travels> getTravels() throws Exception {
        Inscription inscription = ReadInFileJson();
        List<String> listCountry=ReadFileContries("site/src/main/resources/countries.txt");
        ArrayList<Travels> travels=new ArrayList<>();
        //listCountry.forEach(x-> System.out.println(x));
        for(String country : listCountry){
            if(!country.equals(inscription.getUserCountry())){
                Double temp=25.5;
                if(inscription.getWeatherExpectation().equals("WARMER")){
                    if(temp> inscription.getMinimumTemperatureDistance()){Travels travel1=new Travels(country, temp);
                        travels.add(travel1);}}else{
                    if(temp< inscription.getMinimumTemperatureDistance()){
                        Travels travel1=new Travels(country, temp);
                        travels.add(travel1);
                    }}}};return travels;}}





















    /*
    PredictionEngineClient predictionEngineClient=new PredictionEngineClient();

        public Call<List<Temperature>> getTemperature(String country) {
            return null;
        }*/
/*
    private static Map<String, Travels> productRepo = new HashMap<>();
    static {
        Travels tra = new Travels();
        tra.setCountry("France");
        tra.setTemperature("8888");
        productRepo.put(tra.getCountry(), tra);

    }*/



