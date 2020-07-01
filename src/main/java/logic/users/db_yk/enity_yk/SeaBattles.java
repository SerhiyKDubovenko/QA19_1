package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data

public class SeaBattles {
    private int SeaBattlesID;
    private String SeaBattles;
    private String CoanflictKey;
    private String CoalitionKey;
    private String CountryKey;
    private String FleetKey;
    private String Year;
    private String Winner;

    public SeaBattles() {
    }

    public SeaBattles(int seaBattlesID, String seaBattles, String coanflictKey, String coalitionKey, String countryKey, String fleetKey, String year, String winner) {
        SeaBattlesID = seaBattlesID;
        SeaBattles = seaBattles;
        CoanflictKey = coanflictKey;
        CoalitionKey = coalitionKey;
        CountryKey = countryKey;
        FleetKey = fleetKey;
        Year = year;
        Winner = winner;
    }

    public SeaBattles(String seaBattles, String coanflictKey, String coalitionKey, String countryKey, String fleetKey, String year, String winner) {
        SeaBattles = seaBattles;
        CoanflictKey = coanflictKey;
        CoalitionKey = coalitionKey;
        CountryKey = countryKey;
        FleetKey = fleetKey;
        Year = year;
        Winner = winner;
    }
}
