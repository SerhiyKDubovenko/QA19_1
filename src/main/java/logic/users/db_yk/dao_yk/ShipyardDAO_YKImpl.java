package logic.users.db_yk.dao_yk;
import logic.users.db_yk.enity_yk.Shipyard;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ShipyardDAO_YKImpl  extends BaseDAO_YK implements ShipyardDAO {

    public List<Shipyard> getShipyardsList() {
        List<Shipyard> shipyardList = new ArrayList<Shipyard>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select ShipyardID, ShipyardName, CountryKey, CityKey from ShipYards");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                shipyardList.add(new Shipyard(rs.getString("ShipyardID"),
                        rs.getString("ShipyardName"),
                        rs.getString("CountryKey"),
                        rs.getString("CityKey")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return shipyardList;
    }

    public boolean updateShipyard(Shipyard shipyard) {
        Shipyard shipyardForUpdate  =getShipyardsList().stream().filter(o ->o.getShipyardName().contains(shipyard.getShipyardName()))
                .filter(o -> o.getCountryKey().contains(shipyard.getCountryKey()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE ShipYards sh SET  sh.ShipyardName = '"+shipyard.getShipyardName()+"', sh.CountryKey='"+shipyard.getCountryKey()+"', sh.CityKey="+shipyard.getCityKey()+"  WHERE sh.ShipyardID = "+shipyardForUpdate.getShipyardID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getShipyardsList().stream().filter(o -> Integer.valueOf(o.getShipyardID()) == Integer.valueOf(shipyardForUpdate.getShipyardID())).filter(o -> o.getCountryKey().contains(shipyard.getCountryKey())).findFirst().isPresent();
    }

    public boolean deleteShipyard(Shipyard shipyard) {

        Shipyard shipyardForDelete  =getShipyardsList().stream().filter(o ->o.getShipyardName().contains(shipyard.getShipyardName()))
                .filter(o -> o.getCountryKey().contains(shipyard.getCountryKey()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM ShipYards WHERE ShipyardID = "+shipyardForDelete.getShipyardID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getShipyardsList().stream().filter(o ->o.getShipyardName().contains(shipyard.getShipyardName()))
                .filter(o -> o.getCountryKey().contains(shipyard.getCountryKey()))
                .findFirst().isPresent();
    }

    public boolean addShipyard(Shipyard shipyard) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO ShipYards (ShipyardName, CountryKey, CityKey) VALUES ('"+shipyard.getShipyardName()+"', '"+shipyard.getCountryKey()+"', '"+shipyard.getCityKey()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getShipyardsList().stream().filter(o ->o.getShipyardName().contains(shipyard.getShipyardName()))
                .filter(o -> o.getCountryKey().contains(shipyard.getCountryKey()))
                .findFirst().isPresent();
    }
}
