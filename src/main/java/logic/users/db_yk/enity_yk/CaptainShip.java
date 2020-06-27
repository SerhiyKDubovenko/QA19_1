package logic.users.db_yk.enity_yk;
import lombok.Data;

@Data

public class CaptainShip {
    private String CaptainID;
    private String CaptainName;
    private String CountryKey;
    private String FleetKey;

    public CaptainShip() {
    }

    public CaptainShip(String captainID, String captainName, String countryKey, String fleetKey) {
        CaptainID = captainID;
        CaptainName = captainName;
        CountryKey = countryKey;
        FleetKey = fleetKey;
    }

    public CaptainShip(String captainName, String countryKey, String fleetKey) {
        CaptainName = captainName;
        CountryKey = countryKey;
        FleetKey = fleetKey;
    }
}
