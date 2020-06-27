package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.Allies;
import logic.users.db_yk.enity_yk.Conflicts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConflictsDAO_YKImpl extends BaseDAO_YK implements ConflictsDAO{
    public List<Conflicts> getConflictsList() {
        List<Conflicts> conflictsList = new ArrayList<Conflicts>();
        try {
            Statement statement = connection.createStatement();
            statement.execute("select ConflictID, ConflictName, PartiesKey, FromDate, ToDate from Conflicts");
            ResultSet rs = statement.getResultSet();
            while (rs.next()) {
                conflictsList.add(new Conflicts(rs.getString("ConflictID"),
                        rs.getString("ConflictName"),
                        rs.getString("PartiesKey"),
                        rs.getString("FromDate"),
                        rs.getString("ToDate")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conflictsList;
    }

    public boolean updateConflicts(Conflicts conflicts) {
        Conflicts conflictsForUpdate  =getConflictsList().stream().filter(o ->o.getConflictID().contains(conflicts.getConflictID()))
                .filter(o -> o.getPartiesKey().contains(conflicts.getPartiesKey()))
                .findFirst().get();
        try {
            Statement statement = connection.createStatement();
            statement.execute("UPDATE Conflicts cf SET   cf.ConflictName="+conflicts.getConflictName()+" , cf.PartiesKey="+conflicts.getPartiesKey()+" , cf.FromDate="+conflicts.getFromDate()+",cf.ToDate="+conflicts.getToDate()+" WHERE cf.ConflictID = "+conflictsForUpdate.getConflictID());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getConflictsList().stream().filter(o -> Integer.valueOf(o.getConflictID()) == Integer.valueOf(conflictsForUpdate.getConflictID())).filter(o -> o.getPartiesKey().contains(conflicts.getPartiesKey())).findFirst().isPresent();
    }

    public boolean deleteConflicts(Conflicts conflicts) {

        Conflicts conflictsForDelete  =getConflictsList().stream().filter(o ->o.getConflictID().contains(conflicts.getConflictID()))
                .filter(o -> o.getPartiesKey().contains(conflicts.getPartiesKey()))
                .findFirst().get();

        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM Conflicts WHERE ConflictID = "+conflictsForDelete.getConflictID());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return getConflictsList().stream().filter(o ->o.getConflictID().contains(conflicts.getConflictID()))
                .filter(o -> o.getPartiesKey().contains(conflicts.getPartiesKey()))
                .findFirst().isPresent();
    }

    public boolean addConflicts(Conflicts conflicts) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("INSERT INTO Conflicts (ConflictName, PartiesKey, FromDate, ToDate) VALUES ('"+conflicts.getConflictName()+"', '"+conflicts.getPartiesKey()+"', '"+conflicts.getFromDate()+"', '"+conflicts.getToDate()+"')");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return getConflictsList().stream().filter(o ->o.getConflictID().contains(conflicts.getConflictID()))
                .filter(o -> o.getPartiesKey().contains(conflicts.getPartiesKey()))
                .findFirst().isPresent();
    }
}
