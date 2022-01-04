package fr.lernejo.travelsite;

import fr.lernejo.prediction.Temperature;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface PredictionEngineClient {


    @GET("/api/temperature/{country}")
    Call<List<Temperature>> getTravels(@Path("country") String country);

}
