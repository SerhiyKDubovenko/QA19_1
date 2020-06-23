package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data

public class Ships {

    private String ShipsID;
    private String ShipsName;
    private String CountryKey;
    private String FleetKey;
    private String CapitanKey;
    private String ComandorKey;
    private String TypeKey;
    private String ShipyardKey;
    private String Displacement;
    private String Speed;
    private String InstalledPower;
    private String Complement;

    public Ships() {
    }

    public Ships(String shipsID, String shipsName, String countryKey, String fleetKey, String capitanKey, String comandorKey, String typeKey, String shipyardKey, String displacement, String speed, String installedPower, String complement) {
        ShipsID = shipsID;
        ShipsName = shipsName;
        CountryKey = countryKey;
        FleetKey = fleetKey;
        CapitanKey = capitanKey;
        ComandorKey = comandorKey;
        TypeKey = typeKey;
        ShipyardKey = shipyardKey;
        Displacement = displacement;
        Speed = speed;
        InstalledPower = installedPower;
        Complement = complement;
    }

    public Ships(String shipsName, String countryKey, String fleetKey, String capitanKey, String comandorKey, String typeKey, String shipyardKey, String displacement, String speed, String installedPower, String complement) {
        ShipsName = shipsName;
        CountryKey = countryKey;
        FleetKey = fleetKey;
        CapitanKey = capitanKey;
        ComandorKey = comandorKey;
        TypeKey = typeKey;
        ShipyardKey = shipyardKey;
        Displacement = displacement;
        Speed = speed;
        InstalledPower = installedPower;
        Complement = complement;
    }
}
