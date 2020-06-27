package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Parties {
    private String PartieID;
    private String CoalitionKey;
    private String ConflictKey;

    public Parties() {
    }

    public Parties(String partieID, String coalitionKey, String conflictKey) {
        PartieID = partieID;
        CoalitionKey = coalitionKey;
        ConflictKey = conflictKey;
    }

    public Parties(String coalitionKey, String conflictKey) {
        CoalitionKey = coalitionKey;
        ConflictKey = conflictKey;
    }
}
