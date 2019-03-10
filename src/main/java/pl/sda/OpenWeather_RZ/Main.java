package pl.sda.OpenWeather_RZ;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.OpenWeather_RZ.Service.WeatherService;
import pl.sda.OpenWeather_RZ.model.Weather;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Remigiusz Zudzin
 */
public class Main {

    public static void checkWeather() throws IOException {
        Scanner sc = new Scanner(System.in);

            System.out.println("Podaj nazwę miasta");
            String location = sc.nextLine();
            WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json", "75ef5138a56b445faf3120447191003");
            Weather weather = weatherService.getCityWeather(location);

            System.out.println("Nazwa miejscowości: " + weather.getLocation().getName());
            System.out.println("Czas: " + weather.getLocation().getLocaltime());
            System.out.println("Wspolrzedne miejscowości: ");
            System.out.println("Długość geograficzna: " + weather.getLocation().getLat() + " stopni");
            System.out.println("Szerokość geograficzna: " + weather.getLocation().getLon() + " stopni");
            System.out.println("Temperatura: " + weather.getCurrent().getTemp_c() + " stopni Celsjusza");
            System.out.println("Pogoda ogólnie: " + weather.getCurrent().getCondition().getText());

    }

    public static void main(String[] args) {

        try {
            checkWeather();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
