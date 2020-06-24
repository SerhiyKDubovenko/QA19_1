package logic.users.db_yk.dao_yk;

import logic.users.db_yk.enity_yk.CaptainShip;
import logic.users.db_yk.enity_yk.Shipyard;

import java.util.List;

public interface CaptainShipDAO {
    List<CaptainShip> getCaptainShipList();
    boolean updateCaptainShip(CaptainShip captainShip);
    boolean deleteCaptainShip(CaptainShip captainShip);
    boolean addCaptainShip(CaptainShip captainShip);
}
