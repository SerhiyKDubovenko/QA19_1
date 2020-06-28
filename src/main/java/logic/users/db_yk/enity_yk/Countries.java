package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Countries {
private String countryID;
private String country;

    public Countries() {
    }

    public Countries(String countryID, String country) {
        countryID = countryID;
        country = country;
    }

    public Countries(String country) {
        country = country;
    }
}
