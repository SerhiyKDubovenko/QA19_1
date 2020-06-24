package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.ComandorByFleet;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface ComandorByFleetDAO {
    List<ComandorByFleet> getComandorByFleetList();
    boolean updateComandorByFleet(ComandorByFleet comandorByFleet);
    boolean deleteComandorByFleet(ComandorByFleet comandorByFleet);
    boolean addComandorByFleet(ComandorByFleet comandorByFleet);
}
