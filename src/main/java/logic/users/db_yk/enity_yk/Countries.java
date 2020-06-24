package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Countries {
private String CountryID;
private String Country;

    public Countries() {
    }

    public Countries(String countryID, String country) {
        CountryID = countryID;
        Country = country;
    }

    public Countries(String country) {
        Country = country;
    }
}
