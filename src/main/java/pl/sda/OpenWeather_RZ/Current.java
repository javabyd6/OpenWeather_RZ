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
public class Current {

    private Double last_updated_epoch;
    private String last_updated;
    private Double temp_c;
    private Double temp_f;
    private Double is_day;
    private Condition condition;
    private Double wind_mph;
    private Double wind_kph;
    private Double wind_degree;
    private String wind_dir;
    private Double pressure_mb;
    private Double pressure_in;
    private Double precip_mm;
    private Double precip_in;
    private Double humidity;
    private Double cloud;
    private Double feelslike_c;
    private Double feelslike_f;
    private Double vis_km;
    private Double vis_miles;
    private Double uv;
}
