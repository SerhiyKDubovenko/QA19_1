package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Coalitions;
import logic.users.db_yk.enity_yk.Shipyard;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CoalitionsDAO_YKImpl extends BaseDAO_YK implements CoalitionsDAO{

    public List<Coalitions> getCoalitionsList() {
        List<Coalitions> coalitionsList = new ArrayList<Coalitions>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select CoalitionID, Coalition  from Coalitions");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                coalitionsList.add(new Coalitions(rs.getString("CoalitionID"),
                        rs.getString("Coalition")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return coalitionsList;
    }

    public boolean updateCoalitions(Coalitions coalitions) {
        Coalitions coalitionsForUpdate  =getCoalitionsList().stream().filter(o ->o.getCoalition().contains(coalitions.getCoalition()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE Coalitions cl SET  cl.Coalition = '"+coalitions.getCoalition()+"'  WHERE cl.CoalitionID = "+coalitionsForUpdate.getCoalitionID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getCoalitionsList().stream().filter(o -> Integer.valueOf(o.getCoalitionID()) == Integer.valueOf(coalitionsForUpdate.getCoalitionID())).findFirst().isPresent();
    }

    public boolean deleteCoalitions(Coalitions coalitions) {

        Coalitions coalitionsForDelete  =getCoalitionsList().stream().filter(o ->o.getCoalition().contains(coalitions.getCoalition()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM Coalitions WHERE CoalitionID = "+coalitionsForDelete.getCoalitionID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getCoalitionsList().stream().filter(o ->o.getCoalition().contains(coalitions.getCoalition()))
                .findFirst().isPresent();
    }

    public boolean addCoalitions(Coalitions coalitions) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO Coalitions (Coalition) VALUES ('"+coalitions.getCoalition()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getCoalitionsList().stream().filter(o ->o.getCoalition().contains(coalitions.getCoalition()))
                .findFirst().isPresent();
    }
}
