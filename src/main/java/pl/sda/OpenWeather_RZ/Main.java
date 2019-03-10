package pl.sda.OpenWeather_RZ;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    private static void readJsonWeatherDataSet(String location) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Weather weather = mapper.readValue(new URL("http://api.apixu.com/v1/current.json?key=" +
                    "75ef5138a56b445faf3120447191003&q=" + location), Weather.class);
            System.out.println("Nazwa miejscowości: " + weather.getLocation().getName());
            System.out.println("Czas: " + weather.getLocation().getLocaltime());
            System.out.println("Wspolrzedne miejscowości: ");
            System.out.println("Długość geograficzna: " + weather.getLocation().getLat() + " stopni");
            System.out.println("Szerokość geograficzna: " + weather.getLocation().getLon() + " stopni");
            System.out.println("Temperatura: " + weather.getCurrent().getTemp_c() + " stopni Celsjusza");
            System.out.println("Pogoda ogólnie: " + weather.getCurrent().getCondition().getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        readJsonWeatherDataSet("Bydgoszcz");
        System.out.println();
        readJsonWeatherDataSet("Lobzenica");
        System.out.println();
        readJsonWeatherDataSet("Paris");
        System.out.println();
        readJsonWeatherDataSet("Warszawa");
        System.out.println();
        readJsonWeatherDataSet("Lodz");
        System.out.println();
        readJsonWeatherDataSet("Gdansk");
        System.out.println();
        readJsonWeatherDataSet("New_York");
    }

}
