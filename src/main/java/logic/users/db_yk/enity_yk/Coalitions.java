package logic.users.db_yk.enity_yk;
import lombok.Data;

@Data

public class Coalitions {
    private int CoalitionID;
    private String Coalition;

    public Coalitions() {
    }

    public Coalitions(int coalitionID, String coalition) {
        CoalitionID = coalitionID;
        Coalition = coalition;
    }

    public Coalitions(String coalition) {
        Coalition = coalition;
    }
}
