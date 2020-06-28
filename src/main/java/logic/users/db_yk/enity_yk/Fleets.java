package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Fleets {
    private String fleetID;
    private String fleet;
    private String countryKey;
    private String comandorKey;
    private String numberAircraftCarrier;
    private String numberHeavyCruiser;
    private String numberBattlecruiser;
    private String numberLightCruiser;
    private String numberDestroyer;
    private String numberDestroyerFlotillaLeader;
    private String numberCruiser;
    private String numberCruiserSubmarine;
    private String numberSubmarine;
    private String numberCorvette;
    private String numberMinesweeper;
    private String numberEscortCarrier;
    private String numberFrigate;
    private String numberSeaplaneTender;
    private String numberTorpedoBoat;
    private String numberMineLayer;
    private String coalitionKey;

    public Fleets() {
    }

    public Fleets(String fleetID, String fleet, String countryKey, String comandorKey, String numberAircraftCarrier, String numberHeavyCruiser, String numberBattlecruiser, String numberLightCruiser, String numberDestroyer, String numberDestroyerFlotillaLeader, String numberCruiser, String numberCruiserSubmarine, String numberSubmarine, String numberCorvette, String numberMinesweeper, String numberEscortCarrier, String numberFrigate, String numberSeaplaneTender, String numberTorpedoBoat, String numberMineLayer, String coalitionKey) {
        fleetID = fleetID;
        fleet = fleet;
        countryKey = countryKey;
        comandorKey = comandorKey;
        numberAircraftCarrier = numberAircraftCarrier;
        numberHeavyCruiser = numberHeavyCruiser;
        numberBattlecruiser = numberBattlecruiser;
        numberLightCruiser = numberLightCruiser;
        numberDestroyer = numberDestroyer;
        numberDestroyerFlotillaLeader = numberDestroyerFlotillaLeader;
        numberCruiser = numberCruiser;
        numberCruiserSubmarine = numberCruiserSubmarine;
        numberSubmarine = numberSubmarine;
        numberCorvette = numberCorvette;
        numberMinesweeper = numberMinesweeper;
        numberEscortCarrier = numberEscortCarrier;
        numberFrigate = numberFrigate;
        numberSeaplaneTender = numberSeaplaneTender;
        numberTorpedoBoat = numberTorpedoBoat;
        numberMineLayer = numberMineLayer;
        coalitionKey = coalitionKey;
    }

    public Fleets(String fleet, String countryKey, String comandorKey, String numberAircraftCarrier, String numberHeavyCruiser, String numberBattlecruiser, String numberLightCruiser, String numberDestroyer, String numberDestroyerFlotillaLeader, String numberCruiser, String numberCruiserSubmarine, String numberSubmarine, String numberCorvette, String numberMinesweeper, String numberEscortCarrier, String numberFrigate, String numberSeaplaneTender, String numberTorpedoBoat, String numberMineLayer, String coalitionKey) {
        fleet = fleet;
        countryKey = countryKey;
        comandorKey = comandorKey;
        numberAircraftCarrier = numberAircraftCarrier;
        numberHeavyCruiser = numberHeavyCruiser;
        numberBattlecruiser = numberBattlecruiser;
        numberLightCruiser = numberLightCruiser;
        numberDestroyer = numberDestroyer;
        numberDestroyerFlotillaLeader = numberDestroyerFlotillaLeader;
        numberCruiser = numberCruiser;
        numberCruiserSubmarine = numberCruiserSubmarine;
        numberSubmarine = numberSubmarine;
        numberCorvette = numberCorvette;
        numberMinesweeper = numberMinesweeper;
        numberEscortCarrier = numberEscortCarrier;
        numberFrigate = numberFrigate;
        numberSeaplaneTender = numberSeaplaneTender;
        numberTorpedoBoat = numberTorpedoBoat;
        numberMineLayer = numberMineLayer;
        coalitionKey = coalitionKey;
    }
}
