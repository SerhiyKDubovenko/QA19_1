package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.ShipTypes;
import logic.users.db_yk.enity_yk.Ships;
import org.hibernate.Session;

import java.util.List;

public interface ShipsDAO {
    List<Ships> getShipsList(Session session);
    void updateShips(Session session,Ships ships);
    void deleteShips(Session session,Ships ships);
    void addShips(Session session,Ships ships);

}
