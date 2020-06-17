package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class ShipTypes {
    private String  ShipTypeID;
    private String  ShipType;

    public ShipTypes() {
    }

    public ShipTypes(String shipTypeID, String shipType) {
        ShipTypeID = shipTypeID;
        ShipType = shipType;
    }

    public ShipTypes(String shipType) {
        ShipType = shipType;
    }
}
