package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Parties;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface PartiesDAO {
    List<Parties> getPartiesList();
    boolean updateParties(Parties parties);
    boolean deleteParties(Parties parties);
    boolean addParties(Parties parties);
}



