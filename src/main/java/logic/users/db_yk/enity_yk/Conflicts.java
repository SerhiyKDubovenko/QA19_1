package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Conflicts {
private String ConflictID;
private String ConflictName;
private String PartiesKey;
private String FromDate;
private String ToDate;

    public Conflicts() {
    }

    public Conflicts(String conflictID, String conflictName, String partiesKey, String fromDate, String toDate) {
        ConflictID = conflictID;
        ConflictName = conflictName;
        PartiesKey = partiesKey;
        FromDate = fromDate;
        ToDate = toDate;
    }

    public Conflicts(String conflictName, String partiesKey, String fromDate, String toDate) {
        ConflictName = conflictName;
        PartiesKey = partiesKey;
        FromDate = fromDate;
        ToDate = toDate;
    }
}
