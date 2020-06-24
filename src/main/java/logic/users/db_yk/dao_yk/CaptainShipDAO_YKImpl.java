package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.CaptainShip;
import logic.users.db_yk.enity_yk.Shipyard;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CaptainShipDAO_YKImpl extends BaseDAO_YK implements CaptainShipDAO{


    public List<CaptainShip> getCaptainShipList() {
        List<CaptainShip> captainShipList = new ArrayList<CaptainShip>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select CaptainID, CaptainName, CountryKey, FleetKey from CaptainShip");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                captainShipList.add(new CaptainShip(rs.getString("CaptainID"),
                        rs.getString("CaptainName"),
                        rs.getString("CountryKey"),
                        rs.getString("FleetKey")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return captainShipList;
    }

    public boolean updateCaptainShip(CaptainShip captainShip) {
        CaptainShip captainShipForUpdate  =getCaptainShipList().stream().filter(o ->o.getCaptainName().contains(captainShip.getCaptainName()))
                .filter(o -> o.getCountryKey().contains(captainShip.getCountryKey()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE CaptainShip sh SET  cs.CaptainName = '"+captainShip.getCaptainName()+"', cs.CountryKey='"+captainShip.getCountryKey()+"', cs.FleetKey="+captainShip.getFleetKey()+"  WHERE cs.CaptainID = "+captainShipForUpdate.getCaptainID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getCaptainShipList().stream().filter(o -> Integer.valueOf(o.getCaptainID()) == Integer.valueOf(captainShipForUpdate.getCaptainID())).filter(o -> o.getCountryKey().contains(captainShip.getCountryKey())).findFirst().isPresent();
    }

    public boolean deleteCaptainShip(CaptainShip captainShip) {

        CaptainShip captainShipForDelete  =getCaptainShipList().stream().filter(o ->o.getCaptainName().contains(captainShip.getCaptainName()))
                .filter(o -> o.getCountryKey().contains(captainShip.getCountryKey()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM CaptainShip WHERE CaptainID = "+captainShipForDelete.getCaptainID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getCaptainShipList().stream().filter(o ->o.getCaptainName().contains(captainShip.getCaptainName()))
                .filter(o -> o.getCountryKey().contains(captainShip.getCountryKey()))
                .findFirst().isPresent();
    }

    public boolean addCaptainShip(CaptainShip captainShip) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO CaptainShip (CaptainName, CountryKey, FleetKey) VALUES ('"+captainShip.getCaptainName()+"', '"+captainShip.getCountryKey()+"', '"+captainShip.getFleetKey()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getCaptainShipList().stream().filter(o ->o.getCaptainName().contains(captainShip.getCaptainName()))
                .filter(o -> o.getCountryKey().contains(captainShip.getCountryKey()))
                .findFirst().isPresent();
    }
}
