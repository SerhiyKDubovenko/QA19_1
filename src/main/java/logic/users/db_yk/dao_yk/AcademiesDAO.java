package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Academies;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface AcademiesDAO {
    List<Academies> getAcademiesList();
    boolean updateAcademies(Academies academies);
    boolean deleteAcademies(Academies academies);
    boolean addAcademies(Academies academies);
}
