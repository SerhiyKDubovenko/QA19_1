package logic.users.db_yk.enity_yk;

import javax.persistence.*;

@Entity
@SecondaryTables({
        @SecondaryTable(name = "Allies"),
        @SecondaryTable(name = "Coalitions")
})

public class AlliesCoalitions {

    @Id
    private int Allieid;


    @Column(table = "Allies")
    private String CountryKey;

    @Column(table = "Allies")
    private String CoalitionKey;

    @Column(table = "Allies")
    private String FromDate;


    @Column(table = "Allies")
    private String ToDate;


    @Column(table = "Coalitions")
    private String Coalition;

    public AlliesCoalitions() {
    }

    public AlliesCoalitions(int allieid, String countryKey, String coalitionKey, String fromDate, String toDate, String coalition) {
        Allieid = allieid;
        CountryKey = countryKey;
        CoalitionKey = coalitionKey;
        FromDate = fromDate;
        ToDate = toDate;
        Coalition = coalition;
    }

    public AlliesCoalitions(String countryKey, String coalitionKey, String fromDate, String toDate, String coalition) {
        CountryKey = countryKey;
        CoalitionKey = coalitionKey;
        FromDate = fromDate;
        ToDate = toDate;
        Coalition = coalition;
    }

    public int getAllieid() {
        return Allieid;
    }

    public void setAllieid(int allieid) {
        Allieid = allieid;
    }

    public String getCountryKey() {
        return CountryKey;
    }

    public void setCountryKey(String countryKey) {
        CountryKey = countryKey;
    }

    public String getCoalitionKey() {
        return CoalitionKey;
    }

    public void setCoalitionKey(String coalitionKey) {
        CoalitionKey = coalitionKey;
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

    public String getCoalition() {
        return Coalition;
    }

    public void setCoalition(String coalition) {
        Coalition = coalition;
    }
}


