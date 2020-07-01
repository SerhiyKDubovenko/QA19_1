package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Allies;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlliesDAO_YKImpl  extends BaseDAO_YK implements AlliesDAO{

    public List<Allies> getAlliesList() {
        List<Allies> alliesList = new ArrayList<Allies>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select AllieID, CoalitionKey, CountryKey, FromDate, ToDate from Allies");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                alliesList.add(new Allies(rs.getInt("AllieID"),
                        rs.getString("CoalitionKey"),
                        rs.getString("CountryKey"),
                        rs.getString("FromDate"),
                        rs.getString("ToDate")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alliesList;
    }

    public boolean updateAllies(Allies allies) {
        Allies alliesForUpdate  =getAlliesList().stream().filter(o ->o.getCoalitionKey().contains(allies.getCoalitionKey()))
                .filter(o -> o.getCountryKey().contains(allies.getCountryKey()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE Allies al SET   al.CoalitionKey="+allies.getCoalitionKey()+" , al.CountryKey="+allies.getCountryKey()+" , al.FromDate="+allies.getFromDate()+",al.ToDate="+allies.getToDate()+" WHERE al.AllieID = "+alliesForUpdate.getAllieID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getAlliesList().stream().filter(o -> Integer.valueOf(o.getAllieID()) == Integer.valueOf(alliesForUpdate.getAllieID())).filter(o -> o.getCountryKey().contains(allies.getCountryKey())).findFirst().isPresent();
    }

    public boolean deleteAllies(Allies allies) {

        Allies alliesForDelete  =getAlliesList().stream().filter(o ->o.getCoalitionKey().contains(allies.getCoalitionKey()))
                .filter(o -> o.getCountryKey().contains(allies.getCountryKey()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM Allies WHERE AllieID = "+alliesForDelete.getAllieID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getAlliesList().stream().filter(o ->o.getCoalitionKey().contains(allies.getCoalitionKey()))
                .filter(o -> o.getCountryKey().contains(allies.getCountryKey()))
                .findFirst().isPresent();
    }

    public boolean addAllies(Allies allies) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO Allies (CoalitionKey, CountryKey, FromDate, ToDate) VALUES ('"+allies.getCoalitionKey()+"', '"+allies.getCountryKey()+"', '"+allies.getFromDate()+"', '"+allies.getToDate()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getAlliesList().stream().filter(o ->o.getCoalitionKey().contains(allies.getCoalitionKey()))
                .filter(o -> o.getCountryKey().contains(allies.getCountryKey()))
                .findFirst().isPresent();
    }
}
