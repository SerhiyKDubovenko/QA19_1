package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Countries;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface CountriesDAO {

    List<Countries> getCountriesList();
    boolean updateCountries(Countries countries);
    boolean deleteCountries(Countries countries);
    boolean addCountries(Countries countries);
}
