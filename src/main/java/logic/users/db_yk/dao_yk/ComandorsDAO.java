package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Comandors;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface ComandorsDAO {
    List<Comandors> getComandorsList();
    boolean updateComandors(Comandors comandors);
    boolean deleteComandors(Comandors comandors);
    boolean addComandors(Comandors comandors);
}
