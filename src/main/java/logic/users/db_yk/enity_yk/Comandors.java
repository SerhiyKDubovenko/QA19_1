package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Comandors {
private String ComandorID;
private String ComandorName;
private String FleetKey;
private String CountryKey;
private String ShipKey;
private String AcademyKey;
private String YesrOfBorn;
private String YearOfDeath;

    public Comandors() {
    }

    public Comandors(String comandorName, String fleetKey, String countryKey, String shipKey, String academyKey, String yesrOfBorn, String yearOfDeath) {
        ComandorName = comandorName;
        FleetKey = fleetKey;
        CountryKey = countryKey;
        ShipKey = shipKey;
        AcademyKey = academyKey;
        YesrOfBorn = yesrOfBorn;
        YearOfDeath = yearOfDeath;
    }

}
