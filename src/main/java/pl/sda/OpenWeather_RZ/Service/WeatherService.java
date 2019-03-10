package pl.sda.OpenWeather_RZ.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.OpenWeather_RZ.model.Weather;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Remigiusz Zudzin
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherService {

    String URLaddress = "";
    String apiKey = "";

    public Weather getCityWeather(String location) throws IOException {
        String finalURL = URLaddress + "?key=" + apiKey + "&q=";
        ObjectMapper mapper = new ObjectMapper();
        URL url = new URL(finalURL + location);
        return mapper.readValue(url, Weather.class);
    }
    
}
