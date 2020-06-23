package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Conflicts {
private String ConflictID;
private String ConflictNane;
private String PartiesKey;
private String FromDate;
private String ToDate;

    public Conflicts() {
    }

    public Conflicts(String conflictID, String conflictNane, String partiesKey, String fromDate, String toDate) {
        ConflictID = conflictID;
        ConflictNane = conflictNane;
        PartiesKey = partiesKey;
        FromDate = fromDate;
        ToDate = toDate;
    }

    public Conflicts(String conflictNane, String partiesKey, String fromDate, String toDate) {
        ConflictNane = conflictNane;
        PartiesKey = partiesKey;
        FromDate = fromDate;
        ToDate = toDate;
    }
}
