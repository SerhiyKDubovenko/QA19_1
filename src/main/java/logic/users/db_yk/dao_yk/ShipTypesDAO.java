package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.ShipTypes;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface ShipTypesDAO {
    List<ShipTypes> getShipyTypesList();
    boolean updateShipTypes(ShipTypes shipTypes);
    boolean deleteShipTypes(ShipTypes shipyTypes);
    boolean addShipTypes(ShipTypes shipTypes);
}
