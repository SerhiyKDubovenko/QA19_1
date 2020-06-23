package logic.users.db_yk.enity_yk;
import lombok.Data;

@Data

public class Academies {
private String AcademyID;
    private String AcademyName;
    private String CountryKey;
    private String CityKey;

    public Academies() {
    }

    public Academies(String academyID, String academyName, String countryKey, String cityKey) {
        AcademyID = academyID;
        AcademyName = academyName;
        CountryKey = countryKey;
        CityKey = cityKey;
    }

    public Academies(String academyName, String countryKey, String cityKey) {
        AcademyName = academyName;
        CountryKey = countryKey;
        CityKey = cityKey;
    }
}
