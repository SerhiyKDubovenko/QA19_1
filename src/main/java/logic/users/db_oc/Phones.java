package logic.users.db_oc;

import lombok.Data;

@Data
public class Phones {

    private int PhoneID;
    private int Brandkey;
    private int ModelKey;
    private int CountryKey;
    private int CpuKey;
    private int RamKey;
    private int RomKey;
    private int CameraKey;
    private int VideoQuality;
    private int BandKey;
    private int ScreenKey;
    private int SensorKey;
    private String ReleaseDate;

    public Phones() {
    }
}
