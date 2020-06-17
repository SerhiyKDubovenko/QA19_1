package logic.users.db_oc;

import lombok.Data;

@Data
public class Bands {
    private int BandsID;
    private String BandGeneration;
    private String BandFrequencys;

    public Bands() {
    }

    public Bands(int bandsID, String bandGeneration, String bandFrequencys) {
        BandsID = bandsID;
        BandGeneration = bandGeneration;
        BandFrequencys = bandFrequencys;
    }

    public int getBandsID() {
        return BandsID;
    }

    public void setBandsID(int bandsID) {
        BandsID = bandsID;
    }

    public String getBandGeneration() {
        return BandGeneration;
    }

    public void setBandGeneration(String bandGeneration) {
        BandGeneration = bandGeneration;
    }

    public String getBandFrequencys() {
        return BandFrequencys;
    }

    public void setBandFrequencys(String bandFrequencys) {
        BandFrequencys = bandFrequencys;
    }
}
