package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Shipyard {
    private String  shipyardID;
    private String  shipyardName;
    private String countryKey;
    private String cityKey;

    public Shipyard(String shipyardName, String countryKey, String cityKey) {
        shipyardName = shipyardName;
        countryKey = countryKey;
        cityKey = cityKey;
    }

    public Shipyard(String shipyardID, String shipyardName, String countryKey, String cityKey) {
        shipyardID = shipyardID;
        shipyardName = shipyardName;
        countryKey = countryKey;
        cityKey = cityKey;
    }

}
