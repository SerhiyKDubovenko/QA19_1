package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Shipyard {
    private String  ShipyardID;
    private String  ShipyardName;
    private String CountryKey;
    private String CityKey;

    public Shipyard(String shipyardName, String countryKey, String cityKey) {
        ShipyardName = shipyardName;
        CountryKey = countryKey;
        CityKey = cityKey;
    }

    public Shipyard(String shipyardID, String shipyardName, String countryKey, String cityKey) {
        ShipyardID = shipyardID;
        ShipyardName = shipyardName;
        CountryKey = countryKey;
        CityKey = cityKey;
    }

    public String getShipyardID() {
        return ShipyardID;
    }


    public void setShipyardID(String shipyardID) {
        ShipyardID = shipyardID;
    }

    public String getShipyardName() {
        return ShipyardName;
    }

    public void setShipyardName(String shipyardName) {
        ShipyardName = shipyardName;
    }

    public String getCountryKey() {
        return CountryKey;
    }

    public void setCountryKey(String countryKey) {
        CountryKey = countryKey;
    }

    public String getCityKey() {
        return CityKey;
    }

    public void setCityKey(String cityKey) {
        CityKey = cityKey;
    }


}
