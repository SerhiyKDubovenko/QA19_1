package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Allies;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface AlliesDAO {
    List<Allies> getAlliesList();
    boolean updateAllies(Allies allies);
    boolean deleteAllies(Allies allies);
    boolean addAllies(Allies allies);
}
