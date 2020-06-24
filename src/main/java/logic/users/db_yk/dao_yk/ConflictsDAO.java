package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Conflicts;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface ConflictsDAO {

    List<Conflicts> getConflictsList();
    boolean updateConflicts(Conflicts conflicts);
    boolean deleteConflicts(Conflicts conflicts);
    boolean addConflicts(Conflicts conflicts);
}
