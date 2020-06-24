package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Cities;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CitiesDAO_YKImpl extends BaseDAO_YK implements CitiesDAO{


    public List<Cities> getCitiesList() {
        List<Cities> citiesList = new ArrayList<Cities>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select CityID, CityName, CountryKey from ShipYards");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                citiesList.add(new Cities(rs.getString("CityID"),
                        rs.getString("CityName"),
                        rs.getString("CountryKey")));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return citiesList;
    }

    public boolean updateCities(Cities cities) {
        Cities citiesForUpdate  =getCitiesList().stream().filter(o ->o.getCityName().contains(cities.getCityName()))
                .filter(o -> o.getCountryKey().contains(cities.getCountryKey()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE Cities ci SET  ci.CityName = '"+cities.getCityName()+"', ci.CountryKey='"+cities.getCountryKey()+"' WHERE ci.CityID = "+citiesForUpdate.getCityID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getCitiesList().stream().filter(o -> Integer.valueOf(o.getCityID()) == Integer.valueOf(citiesForUpdate.getCityID())).filter(o -> o.getCountryKey().contains(cities.getCountryKey())).findFirst().isPresent();
    }

    public boolean deleteCities(Cities cities) {

        Cities citiesForDelete  =getCitiesList().stream().filter(o ->o.getCityName().contains(cities.getCityName()))
                .filter(o -> o.getCountryKey().contains(cities.getCountryKey()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM Cities WHERE CityID = "+citiesForDelete.getCityID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getCitiesList().stream().filter(o ->o.getCityName().contains(cities.getCityName()))
                .filter(o -> o.getCountryKey().contains(cities.getCountryKey()))
                .findFirst().isPresent();
    }

    public boolean addCities(Cities cities) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO Cities (CityName, CountryKey) VALUES ('"+cities.getCityName()+"', '"+cities.getCountryKey()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getCitiesList().stream().filter(o ->o.getCityName().contains(cities.getCityName()))
                .filter(o -> o.getCountryKey().contains(cities.getCountryKey()))
                .findFirst().isPresent();
    }
}
