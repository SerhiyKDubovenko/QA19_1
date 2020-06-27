package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Countries;
import logic.users.db_yk.enity_yk.ShipTypes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ShipTypesDAO_YKImpl extends BaseDAO_YK implements ShipTypesDAO{


    public List<ShipTypes> getShipTypesList() {
        List<ShipTypes> shipTypesList = new ArrayList<ShipTypes>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select ShipTypeID, ShipType  from ShipTypes");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                shipTypesList.add(new ShipTypes(rs.getString("ShipTypeID"),
                        rs.getString("ShipType")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return shipTypesList;
    }

    public boolean updateShipTypes(ShipTypes shipTypes) {
        ShipTypes shipTypesForUpdate  =getShipTypesList().stream().filter(o ->o.getShipType().contains(shipTypes.getShipType()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE ShipTypes st SET  st.ShipType = '"+shipTypes.getShipType()+"'  WHERE st.ShipTypeID = "+shipTypesForUpdate.getShipTypeID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getShipTypesList().stream().filter(o -> Integer.valueOf(o.getShipTypeID()) == Integer.valueOf(shipTypesForUpdate.getShipTypeID())).findFirst().isPresent();
    }

    public boolean deleteShipTypes(ShipTypes shipTypes) {

        ShipTypes shipTypesForDelete  =getShipTypesList().stream().filter(o ->o.getShipType().contains(shipTypes.getShipType()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM ShipTypes WHERE ShipTypeID = "+shipTypesForDelete.getShipTypeID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getShipTypesList().stream().filter(o ->o.getShipType().contains(shipTypes.getShipType()))
                .findFirst().isPresent();
    }

    public boolean addShipTypes(ShipTypes shipTypes) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO ShipTypes (ShipType) VALUES ('"+shipTypes.getShipType()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getShipTypesList().stream().filter(o ->o.getShipType().contains(shipTypes.getShipType()))
                .findFirst().isPresent();
    }
}
