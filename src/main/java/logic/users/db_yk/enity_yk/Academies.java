package logic.users.db_yk.enity_yk;

import lombok.Data;





@Data
public class Academies {
    private String  academyID;
    private String  academyName;
    private String countryKey;
    private String cityKey;

    public Academies() {
    }

    public Academies(String academyID, String academyName, String countryKey, String cityKey) {
        academyID = academyID;
        academyName = academyName;
        countryKey = countryKey;
        cityKey = cityKey;
    }

    public Academies(String academyName, String countryKey, String cityKey) {
        academyName = academyName;
        countryKey = countryKey;
        cityKey = cityKey;
    }


}
