package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class ComandorByFleet {
    private String comandorByFleetID;
    private String comandorKey;
    private String fleetKey;
    private String fromDate;
    private String toDate;

    public ComandorByFleet() {
    }

    public ComandorByFleet(String comandorByFleetID, String comandorKey, String fleetKey, String fromDate, String toDate) {
        comandorByFleetID = comandorByFleetID;
        comandorKey = comandorKey;
        fleetKey = fleetKey;
        fromDate = fromDate;
        toDate = toDate;
    }

    public ComandorByFleet(String comandorKey, String fleetKey, String fromDate, String toDate) {
        comandorKey = comandorKey;
        fleetKey = fleetKey;
        fromDate = fromDate;
        toDate = toDate;
    }
}
