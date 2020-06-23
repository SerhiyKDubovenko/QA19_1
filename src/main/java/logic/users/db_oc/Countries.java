package logic.users.db_oc;

public class Countries {
    private int CountryID;
    private String Country;

    public Countries() {
    }

    public Countries(int countryID, String country) {
        CountryID = countryID;
        Country = country;
    }

    public int getCountryID() {
        return CountryID;
    }

    public void setCountryID(int countryID) {
        CountryID = countryID;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public static void main(String[] args) {

    }
}
