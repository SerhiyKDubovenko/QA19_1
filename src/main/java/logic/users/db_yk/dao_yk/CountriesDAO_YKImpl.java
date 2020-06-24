package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Coalitions;
import logic.users.db_yk.enity_yk.Countries;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountriesDAO_YKImpl extends BaseDAO_YK implements CountriesDAO{


    public List<Countries> getCountriesList() {
        List<Countries> countriesList = new ArrayList<Countries>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select CountryID, Country  from Countries");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                countriesList.add(new Countries(rs.getString("CountryID"),
                        rs.getString("Country")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countriesList;
    }

    public boolean updateCountries(Countries countries) {
        Countries countriesForUpdate  =getCountriesList().stream().filter(o ->o.getCountry().contains(countries.getCountry()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE Countries cn SET  cn.Country = '"+countries.getCountry()+"'  WHERE cn.CountryID = "+countriesForUpdate.getCountryID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getCountriesList().stream().filter(o -> Integer.valueOf(o.getCountryID()) == Integer.valueOf(countriesForUpdate.getCountryID())).findFirst().isPresent();
    }

    public boolean deleteCountries(Countries countries) {

        Countries countriesForDelete  =getCountriesList().stream().filter(o ->o.getCountry().contains(countries.getCountry()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM Countries WHERE CountryID = "+countriesForDelete.getCountryID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getCountriesList().stream().filter(o ->o.getCountry().contains(countries.getCountry()))
                .findFirst().isPresent();
    }

    public boolean addCountries(Countries countries) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO Countries (Country) VALUES ('"+countries.getCountry()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getCountriesList().stream().filter(o ->o.getCountry().contains(countries.getCountry()))
                .findFirst().isPresent();
    }
}
