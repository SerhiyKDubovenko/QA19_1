package logic.users.db_oc;

import lombok.Data;

@Data
public class CPUs {

    private int CpuID;
    private int Cores;
    private int BrandKey;
    private int ModelKey;

    public CPUs() {
    }

    public CPUs(int cpuID, int cores, int brandKey, int modelKey) {
        CpuID = cpuID;
        Cores = cores;
        BrandKey = brandKey;
        ModelKey = modelKey;
    }

    public int getCpuID() {
        return CpuID;
    }

    public void setCpuID(int cpuID) {
        CpuID = cpuID;
    }

    public int getCores() {
        return Cores;
    }

    public void setCores(int cores) {
        Cores = cores;
    }

    public int getBrandKey() {
        return BrandKey;
    }

    public void setBrandKey(int brandKey) {
        BrandKey = brandKey;
    }

    public int getModelKey() {
        return ModelKey;
    }

    public void setModelKey(int modelKey) {
        ModelKey = modelKey;
    }
}
