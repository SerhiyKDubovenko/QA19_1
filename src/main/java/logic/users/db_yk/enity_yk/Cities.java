package logic.users.db_yk.enity_yk;
import lombok.Data;

@Data

public class Cities {
    private String cityID;
    private String cityName;
    private String countryKey;

    public Cities() {
    }

    public Cities(String cityID, String cityName, String countryKey) {
        cityID = cityID;
        cityName = cityName;
        countryKey = countryKey;
    }

    public Cities(String cityName, String countryKey) {
        cityName = cityName;
        countryKey = countryKey;
    }
}
