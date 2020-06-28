package logic.users.db_yk.enity_yk;
import lombok.Data;

@Data

public class Allies {
private String allieID;
    private String coalitionKey;
    private String countryKey;
    private String fromDate;
    private String toDate;

    public Allies() {
    }

    public Allies(String allieID, String coalitionKey, String countryKey, String fromDate, String toDate) {
        allieID = allieID;
        coalitionKey = coalitionKey;
        countryKey = countryKey;
        fromDate = fromDate;
        toDate = toDate;
    }

    public Allies(String coalitionKey, String countryKey, String fromDate, String toDate) {
        coalitionKey = coalitionKey;
        countryKey = countryKey;
        fromDate = fromDate;
        toDate = toDate;
    }
}
