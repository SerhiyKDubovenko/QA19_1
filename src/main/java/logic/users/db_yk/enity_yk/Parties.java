package logic.users.db_yk.enity_yk;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Parties {

    @Id
    private int partieID;
    private String CoalitionKey;
    private String ConflictKey;

    public Parties() {
    }

    public Parties(int partieID, String coalitionKey, String conflictKey) {
        this.partieID = partieID;
        CoalitionKey = coalitionKey;
        ConflictKey = conflictKey;
    }

    public Parties(String coalitionKey, String conflictKey) {
        CoalitionKey = coalitionKey;
        ConflictKey = conflictKey;
    }
}
