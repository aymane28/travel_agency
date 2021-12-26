package fr.lernejo.prediction;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PredictionService {
    private final TemperatureService temperatureService=new TemperatureService();

    public String getDateOne(){
        // Subtract 1 day from the current date.
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        Date yesterday = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(yesterday);
    }

    public String getDateTwo(){
        // Subtract 1 day from the current date.
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -2);
        Date day2 = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(day2);
    }

    public List<Temp> temperature(String country){
        ArrayList<Temp> temps = new ArrayList<Temp>();
        temps.add(new Temp(getDateOne(),temperatureService.getTemperature(country)));
        temps.add(new Temp(getDateTwo(),temperatureService.getTemperature(country)));
        return temps;
    }
}

