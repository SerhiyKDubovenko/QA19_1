package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Coalition {

    private String  CoalitionID;
    private String  CoalitionName;

    public Coalition() {
    }

    public Coalition(String coalitionID, String coalitionName) {
        CoalitionID = coalitionID;
        CoalitionName = coalitionName;
    }

    public Coalition(String coalitionName) {
        CoalitionName = coalitionName;
    }

    public String getCoalitionID() {
        return CoalitionID;
    }

    public void setCoalitionID(String coalitionID) {
        CoalitionID = coalitionID;
    }

    public String getCoalitionName() {
        return CoalitionName;
    }

    public void setCoalitionName(String coalitionName) {
        CoalitionName = coalitionName;
    }
}
