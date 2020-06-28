package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data


public class ShipTypes {
    private String shipTypeID;
    private String shipType;

    public ShipTypes() {
    }

    public ShipTypes(String shipTypeID, String shipType) {
        shipTypeID = shipTypeID;
        shipType = shipType;
    }

    public ShipTypes(String shipType) {
        shipType = shipType;
    }
}
