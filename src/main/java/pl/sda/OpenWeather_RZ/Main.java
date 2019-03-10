package pl.sda.OpenWeather_RZ;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    private static void readJsonWeatherDataSet(String location) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Weather weather = mapper.readValue(new File
                    ("http://api.apixu.com/v1/current.json?key=75ef5138a56b445faf3120447191003&q=" +
                            location), Weather.class);
            System.out.println("Nazwa miejscowości: " + weather.getLocation().getName());
            System.out.println("Czas: " + weather.getLocation().getLocaltime());
            System.out.println("Wspolrzedne miejscowości: ");
            System.out.println("Długość geograficzna: " + weather.getLocation().getLat());
            System.out.println("Szerokość geograficzna: " + weather.getLocation().getLon());
            System.out.println("Temperatura: " + weather.getCurrent().getTemp_c());
            System.out.println("Zachmurzenie: " + weather.getCurrent().getCondition().getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        readJsonWeatherDataSet("Bydgoszcz");

    }

}
