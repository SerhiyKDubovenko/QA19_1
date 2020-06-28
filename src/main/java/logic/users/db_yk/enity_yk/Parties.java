package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Parties {
    private String partieID;
    private String coalitionKey;
    private String conflictKey;

    public Parties() {
    }

    public Parties(String partieID, String coalitionKey, String conflictKey) {
        partieID = partieID;
        coalitionKey = coalitionKey;
        conflictKey = conflictKey;
    }

    public Parties(String coalitionKey, String conflictKey) {
        coalitionKey = coalitionKey;
        conflictKey = conflictKey;
    }
}
