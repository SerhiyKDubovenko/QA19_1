package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Cities;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface CitiesDAO {
    List<Cities> getCitiesList();
    boolean updateCities(Cities cities);
    boolean deleteCities(Cities cities);
    boolean addCities(Cities cities);
}
