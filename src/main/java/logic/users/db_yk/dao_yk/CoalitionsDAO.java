package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Coalitions;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface CoalitionsDAO {
    List<Coalitions> getCoalitionsList();
    boolean updateCoalitions(Coalitions coalitions);
    boolean deleteCoalitions(Coalitions coalitions);
    boolean addCoalitions(Coalitions coalitions);
}
