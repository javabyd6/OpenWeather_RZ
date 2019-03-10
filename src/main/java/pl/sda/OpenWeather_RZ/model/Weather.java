package pl.sda.OpenWeather_RZ.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.OpenWeather_RZ.model.Current;
import pl.sda.OpenWeather_RZ.model.Location;

/**
 * @author Remigiusz Zudzin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {

    private Location location;
    private Current current;


}
