package Hometask9;

import java.util.Objects;

public final class Smartphone extends PortableDevices {
    private String osType;
    private int cameraPixels;
    private boolean nfcExists;

    public Smartphone() {
    }

    public Smartphone(String manufacturer, String modelName, boolean displayExists, int displaySize,
                      int displayResolution, boolean keyboardExists, String osType, int cameraPixels, boolean nfcExists) {
        super(manufacturer, modelName, displayExists, displaySize, displayResolution, keyboardExists);
        this.osType = osType;
        this.cameraPixels = cameraPixels;
        this.nfcExists = nfcExists;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public int getCameraPixels() {
        return cameraPixels;
    }

    public void setCameraPixels(int cameraPixels) {
        this.cameraPixels = cameraPixels;
    }

    public boolean isNfcExists() {
        return nfcExists;
    }

    public void setNfcExists(boolean nfcExists) {
        this.nfcExists = nfcExists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return cameraPixels == that.cameraPixels &&
                nfcExists == that.nfcExists &&
                Objects.equals(osType, that.osType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), osType, cameraPixels, nfcExists);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "osType='" + osType + '\'' +
                ", cameraPixels=" + cameraPixels +
                ", nfcExists=" + nfcExists +
                '}';
    }

    public void call () {
        System.out.println("You can call other people");
    }

    @Override
    public void bootSetup() {
        System.out.println("Boot iOS 10");

    }

    @Override
    public void startUpMenu() {
        System.out.println("Open Siri assistant");

    }

    @Override
    public void startApp() {
        System.out.println("Open instagram and upload new photos");

    }

    @Override
    public void closeApp() {
        System.out.println("Close instagram and read books");

    }
}
