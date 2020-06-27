package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.ShipTypes;
import logic.users.db_yk.enity_yk.Ships;

import java.util.List;

public interface ShipsDAO {
    List<Ships> getShipsList();
    boolean updateShips(Ships ships);
    boolean deleteShips(Ships ships);
    boolean addShips(Ships ships);

}
