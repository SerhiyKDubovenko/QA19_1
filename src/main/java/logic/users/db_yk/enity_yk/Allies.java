package logic.users.db_yk.enity_yk;
import lombok.Data;

@Data

public class Allies {
    private int AllieID;
    private String CoalitionKey;
    private String CountryKey;
    private String FromDate;
    private String ToDate;

    public Allies() {
    }

    public Allies(int allieID, String coalitionKey, String countryKey, String fromDate, String toDate) {
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

    public int getAllieID() {
        return AllieID;
    }

    public void setAllieID(int allieID) {
        AllieID = allieID;
    }

    public String getCoalitionKey() {
        return CoalitionKey;
    }

    public void setCoalitionKey(String coalitionKey) {
        CoalitionKey = coalitionKey;
    }

    public String getCountryKey() {
        return CountryKey;
    }

    public void setCountryKey(String countryKey) {
        CountryKey = countryKey;
    }

    public String getFromDate() {
        return FromDate;
    }

    public void setFromDate(String fromDate) {
        FromDate = fromDate;
    }

    public String getToDate() {
        return ToDate;
    }

    public void setToDate(String toDate) {
        ToDate = toDate;
    }
}