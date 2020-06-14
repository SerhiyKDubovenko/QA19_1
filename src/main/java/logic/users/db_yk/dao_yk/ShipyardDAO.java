package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Shipyard;
import java.util.List;

public interface ShipyardDAO {
    List<Shipyard> getShipyardsList();
    boolean updateShipyard(Shipyard shipyard);
    boolean deleteShipyard(Shipyard shipyard);
    boolean addShipyard(Shipyard shipyard);
}
