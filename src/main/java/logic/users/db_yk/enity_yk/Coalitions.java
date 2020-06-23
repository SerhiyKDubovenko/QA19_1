package logic.users.db_yk.enity_yk;
import lombok.Data;

@Data

public class Coalitions {
    private String CoalitionID;
    private String Coalition;

    public Coalitions() {
    }

    public Coalitions(String coalitionID, String coalition) {
        CoalitionID = coalitionID;
        Coalition = coalition;
    }

    public Coalitions(String coalition) {
        Coalition = coalition;
    }
}
