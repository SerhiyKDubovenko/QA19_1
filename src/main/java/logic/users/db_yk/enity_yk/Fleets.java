package logic.users.db_yk.enity_yk;

import lombok.Data;

@Data
public class Fleets {
    private String FleetID;
    private String Fleet;
    private String CountryKey;
    private String ComandorKey;
    private String NumberAircraftCarrier;
    private String NumberHeavyCruiser;
    private String NumberBattlecruiser;
    private String NumberLightCruiser;
    private String NumberDestroyer;
    private String NumberDestroyerFlotillaLeader;
    private String NumberCruiser;
    private String NumberCruiserSubmarine;
    private String NumberSubmarine;
    private String NumberCorvette;
    private String NumberMinesweeper;
    private String NumberEscortCarrier;
    private String NumberFrigate;
    private String NumberSeaplaneTender;
    private String NumberTorpedoBoat;
    private String NumberMineLayer;
    private String CoalitionKey;

    public Fleets() {
    }

    public Fleets(String fleetID, String fleet, String countryKey, String comandorKey, String numberAircraftCarrier, String numberHeavyCruiser, String numberBattlecruiser, String numberLightCruiser, String numberDestroyer, String numberDestroyerFlotillaLeader, String numberCruiser, String numberCruiserSubmarine, String numberSubmarine, String numberCorvette, String numberMinesweeper, String numberEscortCarrier, String numberFrigate, String numberSeaplaneTender, String numberTorpedoBoat, String numberMineLayer, String coalitionKey) {
        FleetID = fleetID;
        Fleet = fleet;
        CountryKey = countryKey;
        ComandorKey = comandorKey;
        NumberAircraftCarrier = numberAircraftCarrier;
        NumberHeavyCruiser = numberHeavyCruiser;
        NumberBattlecruiser = numberBattlecruiser;
        NumberLightCruiser = numberLightCruiser;
        NumberDestroyer = numberDestroyer;
        NumberDestroyerFlotillaLeader = numberDestroyerFlotillaLeader;
        NumberCruiser = numberCruiser;
        NumberCruiserSubmarine = numberCruiserSubmarine;
        NumberSubmarine = numberSubmarine;
        NumberCorvette = numberCorvette;
        NumberMinesweeper = numberMinesweeper;
        NumberEscortCarrier = numberEscortCarrier;
        NumberFrigate = numberFrigate;
        NumberSeaplaneTender = numberSeaplaneTender;
        NumberTorpedoBoat = numberTorpedoBoat;
        NumberMineLayer = numberMineLayer;
        CoalitionKey = coalitionKey;
    }

    public Fleets(String fleet, String countryKey, String comandorKey, String numberAircraftCarrier, String numberHeavyCruiser, String numberBattlecruiser, String numberLightCruiser, String numberDestroyer, String numberDestroyerFlotillaLeader, String numberCruiser, String numberCruiserSubmarine, String numberSubmarine, String numberCorvette, String numberMinesweeper, String numberEscortCarrier, String numberFrigate, String numberSeaplaneTender, String numberTorpedoBoat, String numberMineLayer, String coalitionKey) {
        Fleet = fleet;
        CountryKey = countryKey;
        ComandorKey = comandorKey;
        NumberAircraftCarrier = numberAircraftCarrier;
        NumberHeavyCruiser = numberHeavyCruiser;
        NumberBattlecruiser = numberBattlecruiser;
        NumberLightCruiser = numberLightCruiser;
        NumberDestroyer = numberDestroyer;
        NumberDestroyerFlotillaLeader = numberDestroyerFlotillaLeader;
        NumberCruiser = numberCruiser;
        NumberCruiserSubmarine = numberCruiserSubmarine;
        NumberSubmarine = numberSubmarine;
        NumberCorvette = numberCorvette;
        NumberMinesweeper = numberMinesweeper;
        NumberEscortCarrier = numberEscortCarrier;
        NumberFrigate = numberFrigate;
        NumberSeaplaneTender = numberSeaplaneTender;
        NumberTorpedoBoat = numberTorpedoBoat;
        NumberMineLayer = numberMineLayer;
        CoalitionKey = coalitionKey;
    }
}
