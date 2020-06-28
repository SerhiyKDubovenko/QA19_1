package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data

public class Ships {

    private int shipsID;
    private String shipsName;
    private String countryKey;
    private String fleetKey;
    private String capitanKey;
    private String comandorKey;
    private String typeKey;
    private String shipyardKey;
    private String displacement;
    private String speed;
    private String installedPower;
    private String complement;

    public Ships() {
    }

    public Ships(int shipsID, String shipsName, String countryKey, String fleetKey, String capitanKey, String comandorKey, String typeKey, String shipyardKey, String displacement, String speed, String installedPower, String complement) {
        shipsID = shipsID;
        shipsName = shipsName;
        countryKey = countryKey;
        fleetKey = fleetKey;
        capitanKey = capitanKey;
        comandorKey = comandorKey;
        typeKey = typeKey;
        shipyardKey = shipyardKey;
        displacement = displacement;
        speed = speed;
        installedPower = installedPower;
        complement = complement;
    }

    public Ships(String shipsName, String countryKey, String fleetKey, String capitanKey, String comandorKey, String typeKey, String shipyardKey, String displacement, String speed, String installedPower, String complement) {
        shipsName = shipsName;
        countryKey = countryKey;
        fleetKey = fleetKey;
        capitanKey = capitanKey;
        comandorKey = comandorKey;
        typeKey = typeKey;
        shipyardKey = shipyardKey;
        displacement = displacement;
        speed = speed;
        installedPower = installedPower;
        complement = complement;
    }

}
