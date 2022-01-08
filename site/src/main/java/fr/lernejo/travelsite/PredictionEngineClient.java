package fr.lernejo.travelsite;

//import fr.lernejo.prediction.Temperature;
import fr.lernejo.travelsite.model.TemperatureApp;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PredictionEngineClient {

    @GET("/api/temperature")
    Call<TemperatureApp> getTemperature(@Path("country") String country);

}
