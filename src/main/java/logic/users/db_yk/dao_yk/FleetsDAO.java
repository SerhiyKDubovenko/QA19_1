package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Fleets;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface FleetsDAO {
    List<Fleets> getFleetsList();
    boolean updateShipyardFleets(Fleets fleets);
    boolean deleteFleets(Fleets fleets);
    boolean addFleets(Fleets fleets);
}
