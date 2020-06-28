package logic.users.db_yk.enity_yk;
import lombok.Data;

@Data

public class Coalitions {
    private String coalitionID;
    private String coalition;

    public Coalitions() {
    }

    public Coalitions(String coalitionID, String coalition) {
        coalitionID = coalitionID;
        coalition = coalition;
    }

    public Coalitions(String coalition) {
        coalition = coalition;
    }
}
