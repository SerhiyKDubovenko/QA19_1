package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Academies;
import logic.users.db_yk.enity_yk.Shipyard;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AcademiesDAO_YKImpl extends BaseDAO_YK implements AcademiesDAO{
    public List<Academies> getAcademiesList() {
        List<Academies> academiesList = new ArrayList<Academies>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select AcademyID, AcademyName, CountryKey, CityKey from Academies");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                academiesList.add(new Academies(rs.getString("AcademyID"),
                        rs.getString("AcademyName"),
                        rs.getString("CountryKey"),
                        rs.getString("CityKey")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return academiesList;
    }

    public boolean updateAcademies(Academies academies) {
        Academies academiesForUpdate  =getAcademiesList().stream().filter(o ->o.getAcademyName().contains(academies.getAcademyName()))
                .filter(o -> o.getCountryKey().contains(academies.getCountryKey()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE Academies ac SET  ac.AcademyName = '"+academies.getAcademyName()+"', ac.CountryKey='"+academies.getCountryKey()+"', ac.CityKey="+academies.getCityKey()+"  WHERE ac.AcademyID = "+academiesForUpdate.getAcademyID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getAcademiesList().stream().filter(o -> Integer.valueOf(o.getAcademyID()) == Integer.valueOf(academiesForUpdate.getAcademyID())).filter(o -> o.getCountryKey().contains(academies.getCountryKey())).findFirst().isPresent();
    }

    public boolean deleteAcademies(Academies academies) {

        Academies academiesForDelete  =getAcademiesList().stream().filter(o ->o.getAcademyName().contains(academies.getAcademyName()))
                .filter(o -> o.getCountryKey().contains(academies.getCountryKey()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM Academies WHERE AcademyID = "+academiesForDelete.getAcademyID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getAcademiesList().stream().filter(o ->o.getAcademyName().contains(academies.getAcademyName()))
                .filter(o -> o.getCountryKey().contains(academies.getCountryKey()))
                .findFirst().isPresent();
    }

    public boolean addAcademies(Academies academies) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO Academies (AcademyName, CountryKey, CityKey) VALUES ('"+academies.getAcademyName()+"', '"+academies.getCountryKey()+"', '"+academies.getCityKey()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getAcademiesList().stream().filter(o ->o.getAcademyName().contains(academies.getAcademyName()))
                .filter(o -> o.getCountryKey().contains(academies.getCountryKey()))
                .findFirst().isPresent();
    }
}
