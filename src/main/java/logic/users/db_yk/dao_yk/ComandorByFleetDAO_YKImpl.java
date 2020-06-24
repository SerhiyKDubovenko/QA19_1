package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.ComandorByFleet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ComandorByFleetDAO_YKImpl extends BaseDAO_YK implements ComandorByFleetDAO{

    public List<ComandorByFleet> getComandorByFleetList() {
        List<ComandorByFleet> comandorByFleetList = new ArrayList<ComandorByFleet>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select ComandorByFleetID, ComandorKey, FleetKey, FromDate, ToDate from ComandorByFleet");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                comandorByFleetList.add(new ComandorByFleet(rs.getString("ComandorByFleetID"),
                        rs.getString("ComandorKey"),
                        rs.getString("FleetKey"),
                        rs.getString("FromDate"),
                        rs.getString("ToDate")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return comandorByFleetList;
    }

    public boolean updateComandorByFleet(ComandorByFleet comandorByFleet) {
        ComandorByFleet comandorByFleetForUpdate  =getComandorByFleetList().stream().filter(o ->o.getComandorByFleetID().contains(comandorByFleet.getComandorKey()))
                .filter(o -> o.getFleetKey().contains(comandorByFleet.getFleetKey()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE ComandorByFleet cbf SET   cbf.ComandorKey="+comandorByFleet.getComandorKey()+" , cbf.FleetKey="+comandorByFleet.getFleetKey()+" , cbf.FromDate="+comandorByFleet.getFromDate()+",cbf.ToDate="+comandorByFleet.getToDate()+" WHERE cbf.ComandorByFleetID = "+comandorByFleetForUpdate.getComandorByFleetID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getComandorByFleetList().stream().filter(o -> Integer.valueOf(o.getComandorByFleetID()) == Integer.valueOf(comandorByFleetForUpdate.getComandorByFleetID())).filter(o -> o.getFleetKey().contains(comandorByFleet.getFleetKey())).findFirst().isPresent();
    }

    public boolean deleteComandorByFleet(ComandorByFleet comandorByFleet) {

        ComandorByFleet comandorByFleetForDelete  =getComandorByFleetList().stream().filter(o ->o.getComandorByFleetID().contains(comandorByFleet.getComandorByFleetID()))
                .filter(o -> o.getFleetKey().contains(comandorByFleet.getFleetKey()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM ComandorByFleet WHERE ComandorByFleetID = "+comandorByFleetForDelete.getComandorByFleetID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getComandorByFleetList().stream().filter(o ->o.getComandorByFleetID().contains(comandorByFleet.getComandorByFleetID()))
                .filter(o -> o.getFleetKey().contains(comandorByFleet.getFleetKey()))
                .findFirst().isPresent();
    }

    public boolean addComandorByFleet(ComandorByFleet comandorByFleet) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO ComandorByFleet (ComandorKey, FleetKey, FromDate, ToDate) VALUES ('"+comandorByFleet.getComandorKey()+"', '"+comandorByFleet.getFleetKey()+"', '"+comandorByFleet.getFromDate()+"', '"+comandorByFleet.getToDate()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getComandorByFleetList().stream().filter(o ->o.getComandorByFleetID().contains(comandorByFleet.getComandorByFleetID()))
                .filter(o -> o.getFleetKey().contains(comandorByFleet.getFleetKey()))
                .findFirst().isPresent();
    }
}
