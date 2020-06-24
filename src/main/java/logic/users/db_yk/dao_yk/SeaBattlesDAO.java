package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.SeaBattles;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface SeaBattlesDAO {
    List<SeaBattles> getSeaBattlesList();
    boolean updateSeaBattles(SeaBattles seaBattles);
    boolean deleteSeaBattles(SeaBattles seaBattles);
    boolean addSeaBattles(SeaBattles seaBattles);
}
