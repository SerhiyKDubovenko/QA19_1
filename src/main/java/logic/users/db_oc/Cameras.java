package logic.users.db_oc;

import lombok.Data;

@Data
public class Cameras {

    private int CameraID;
    private String Type;
    private String Resolution;
    private double Aperture;

    public Cameras() {
    }

    public Cameras(int cameraID, String type, String resolution, double aperture) {
        CameraID = cameraID;
        Type = type;
        Resolution = resolution;
        Aperture = aperture;
    }

    public int getCameraID() {
        return CameraID;
    }

    public void setCameraID(int cameraID) {
        CameraID = cameraID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getResolution() {
        return Resolution;
    }

    public void setResolution(String resolution) {
        Resolution = resolution;
    }

    public double getAperture() {
        return Aperture;
    }

    public void setAperture(double aperture) {
        Aperture = aperture;
    }
}
