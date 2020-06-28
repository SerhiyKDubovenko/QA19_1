package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Comandors {
private String comandorID;
private String comandorName;
private String fleetKey;
private String countryKey;
private String shipKey;
private String academyKey;
private String yearOfBorn;
private String yearOfDeath;

    public Comandors() {
    }

    public Comandors(String comandorID, String comandorName, String fleetKey, String countryKey, String shipKey, String academyKey, String yearOfBorn, String yearOfDeath) {
        comandorID = comandorID;
        comandorName = comandorName;
        fleetKey = fleetKey;
        countryKey = countryKey;
        shipKey = shipKey;
        academyKey = academyKey;
        yearOfBorn = yearOfBorn;
        yearOfDeath = yearOfDeath;
    }

    public Comandors(String comandorName, String fleetKey, String countryKey, String shipKey, String academyKey, String yearOfBorn, String yearOfDeath) {
        comandorName = comandorName;
        fleetKey = fleetKey;
        countryKey = countryKey;
        shipKey = shipKey;
        academyKey = academyKey;
        yearOfBorn = yearOfBorn;
        yearOfDeath = yearOfDeath;
    }

}
