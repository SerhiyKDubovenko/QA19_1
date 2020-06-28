package logic.users.db_yk.enity_yk;
import lombok.Data;

@Data

public class CaptainShip {
    private String captainID;
    private String captainName;
    private String countryKey;
    private String fleetKey;

    public CaptainShip() {
    }

    public CaptainShip(String captainID, String captainName, String countryKey, String fleetKey) {
        captainID = captainID;
        captainName = captainName;
        countryKey = countryKey;
        fleetKey = fleetKey;
    }

    public CaptainShip(String captainName, String countryKey, String fleetKey) {
        captainName = captainName;
        countryKey = countryKey;
        fleetKey = fleetKey;
    }
}
