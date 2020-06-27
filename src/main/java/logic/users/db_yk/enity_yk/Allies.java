package logic.users.db_yk.enity_yk;
import lombok.Data;

@Data

public class Allies {
private String AllieID;
    private String CoalitionKey;
    private String CountryKey;
    private String FromDate;
    private String ToDate;

    public Allies() {
    }

    public Allies(String allieID, String coalitionKey, String countryKey, String fromDate, String toDate) {
        AllieID = allieID;
        CoalitionKey = coalitionKey;
        CountryKey = countryKey;
        FromDate = fromDate;
        ToDate = toDate;
    }

    public Allies(String coalitionKey, String countryKey, String fromDate, String toDate) {
        CoalitionKey = coalitionKey;
        CountryKey = countryKey;
        FromDate = fromDate;
        ToDate = toDate;
    }
}
