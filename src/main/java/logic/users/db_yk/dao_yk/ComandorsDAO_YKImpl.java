package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.ComandorByFleet;
import logic.users.db_yk.enity_yk.Comandors;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ComandorsDAO_YKImpl extends BaseDAO_YK implements ComandorsDAO{

    public List<Comandors> getComandorsList() {
        List<Comandors> comandorsList = new ArrayList<Comandors>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select ComandorID, ComandorName, FleetKey, CountryKey, ShipKey, AcademyKey, YearOfBorn, YearOfDeath from Comandors");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                comandorsList.add(new Comandors(rs.getString("ComandorID"),
                        rs.getString("ComandorName"),
                        rs.getString("FleetKey"),
                        rs.getString("CountryKey"),
                        rs.getString("ShipKey"),
                        rs.getString("AcademyKey"),
                        rs.getString("YearOfBorn"),
                        rs.getString("YearOfDeath")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comandorsList;
    }

    public boolean updateComandors(Comandors comandors) {
        Comandors comandorsForUpdate  =getComandorsList().stream().filter(o ->o.getComandorID().contains(comandors.getComandorID()))
                .filter(o -> o.getFleetKey().contains(comandors.getFleetKey()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE Comandors cm SET   cm.ComandorName="+comandors.getComandorName()+" , cm.FleetKey="+comandors.getFleetKey()+" , cm.CountryKey="+comandors.getCountryKey()+" , cm.ShipKey="+comandors.getShipKey()+", cm.AcademyKey="+comandors.getAcademyKey()+", cm.YearOfBorn="+comandors.getYearOfBorn()+",cm.YearOfDeath="+comandors.getYearOfDeath()+" WHERE cm.ComandorsID = "+comandorsForUpdate.getComandorID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getComandorsList().stream().filter(o -> Integer.valueOf(o.getComandorID()) == Integer.valueOf(comandorsForUpdate.getComandorID())).filter(o -> o.getFleetKey().contains(comandors.getFleetKey())).findFirst().isPresent();
    }

    public boolean deleteComandors(Comandors comandors) {

        Comandors comandorsForDelete  =getComandorsList().stream().filter(o ->o.getComandorID().contains(comandors.getComandorID()))
                .filter(o -> o.getFleetKey().contains(comandors.getFleetKey()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM Comandors WHERE ComandorID = "+comandorsForDelete.getComandorID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getComandorsList().stream().filter(o ->o.getComandorID().contains(comandors.getComandorID()))
                .filter(o -> o.getFleetKey().contains(comandors.getFleetKey()))
                .findFirst().isPresent();
    }

    public boolean addComandors(Comandors comandors) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO Comandors (ComandorName, FleetKey, CountryKey, ShipKey, AcademyKey YearOfBorn, YearOfDeath) VALUES ('"+comandors.getComandorName()+"', '"+comandors.getFleetKey()+"',  '"+comandors.getCountryKey()+"', '"+comandors.getShipKey()+"', '"+comandors.getAcademyKey()+"','"+comandors.getYearOfBorn()+"', '"+comandors.getYearOfDeath()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getComandorsList().stream().filter(o ->o.getComandorID().contains(comandors.getComandorID()))
                .filter(o -> o.getFleetKey().contains(comandors.getFleetKey()))
                .findFirst().isPresent();
    }

}
