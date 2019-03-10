package pl.sda.OpenWeather_RZ;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Remigiusz Zudzin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Condition {

    private String text;
    private String icon;
    private Integer code;

}
