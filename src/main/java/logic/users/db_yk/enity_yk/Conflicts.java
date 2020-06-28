package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Conflicts {
private String conflictID;
private String conflictName;
private String partiesKey;
private String fromDate;
private String toDate;

    public Conflicts() {
    }

    public Conflicts(String conflictID, String conflictName, String partiesKey, String fromDate, String toDate) {
        conflictID = conflictID;
        conflictName = conflictName;
        partiesKey = partiesKey;
        fromDate = fromDate;
        toDate = toDate;
    }

    public Conflicts(String conflictName, String partiesKey, String fromDate, String toDate) {
        conflictName = conflictName;
        partiesKey = partiesKey;
        fromDate = fromDate;
        toDate = toDate;
    }
}
