package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class ComandorByFleet {
    private String ComandorByFleetID;
    private String ComandorKey;
    private String FleetKey;
    private String FromDate;
    private String ToDate;

    public ComandorByFleet() {
    }

    public ComandorByFleet(String comandorByFleetID, String comandorKey, String fleetKey, String fromDate, String toDate) {
        ComandorByFleetID = comandorByFleetID;
        ComandorKey = comandorKey;
        FleetKey = fleetKey;
        FromDate = fromDate;
        ToDate = toDate;
    }

    public ComandorByFleet(String comandorKey, String fleetKey, String fromDate, String toDate) {
        ComandorKey = comandorKey;
        FleetKey = fleetKey;
        FromDate = fromDate;
        ToDate = toDate;
    }
}
