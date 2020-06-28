package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data

public class SeaBattles {
    private String seaBattlesID;
    private String seaBattles;
    private String coanflictKey;
    private String coalitionKey;
    private String countryKey;
    private String fleetKey;
    private String year;
    private String winner;

    public SeaBattles() {
    }

    public SeaBattles(String seaBattlesID, String seaBattles, String coanflictKey, String coalitionKey, String countryKey, String fleetKey, String year, String winner) {
        seaBattlesID = seaBattlesID;
        seaBattles = seaBattles;
        coanflictKey = coanflictKey;
        coalitionKey = coalitionKey;
        countryKey = countryKey;
        fleetKey = fleetKey;
        year = year;
        winner = winner;
    }

    public SeaBattles(String seaBattles, String coanflictKey, String coalitionKey, String countryKey, String fleetKey, String year, String winner) {
        seaBattles = seaBattles;
        coanflictKey = coanflictKey;
        coalitionKey = coalitionKey;
        countryKey = countryKey;
        fleetKey = fleetKey;
        year = year;
        winner = winner;
    }
}
