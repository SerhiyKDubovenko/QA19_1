package logic.users.db_yk.enity_yk;
import lombok.Data;

@Data

public class Cities {
    private String CityID;
    private String CityName;
    private String CountryKey;

    public Cities() {
    }

    public Cities(String cityID, String cityName, String countryKey) {
        CityID = cityID;
        CityName = cityName;
        CountryKey = countryKey;
    }

    public Cities(String cityName, String countryKey) {
        CityName = cityName;
        CountryKey = countryKey;
    }
}
