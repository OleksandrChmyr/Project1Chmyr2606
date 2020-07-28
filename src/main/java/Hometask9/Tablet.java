package Hometask9;

import java.util.Objects;

public final class Tablet extends PortableDevices {
    private int batteryVolume;
    private String color;
    private boolean gpsExists;

    public Tablet() {
    }

    public Tablet(String manufacturer, String modelName, boolean displayExists, int displaySize, int displayResolution,
                  boolean keyboardExists, int batteryVolume, String color, boolean gpsExists) {
        super(manufacturer, modelName, displayExists, displaySize, displayResolution, keyboardExists);
        this.batteryVolume = batteryVolume;
        this.color = color;
        this.gpsExists = gpsExists;
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isGpsExists() {
        return gpsExists;
    }

    public void setGpsExists(boolean gpsExists) {
        this.gpsExists = gpsExists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Tablet tablet = (Tablet) o;
        return batteryVolume == tablet.batteryVolume &&
                gpsExists == tablet.gpsExists &&
                Objects.equals(color, tablet.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batteryVolume, color, gpsExists);
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "batteryVolume=" + batteryVolume +
                ", color='" + color + '\'' +
                ", gpsExists=" + gpsExists +
                '}';
    }

    public void watchVideo () {
        System.out.println("You can watch lots of videos on your tablet PC");
    }

    @Override
    public void bootSetup() {
        System.out.println("Boot Android 12");

    }

    @Override
    public void startUpMenu() {
        System.out.println("Open Google assistant");

    }

    @Override
    public void startApp() {
        System.out.println("Open mailbox to see new emails");

    }

    @Override
    public void closeApp() {
        System.out.println("Close mailbox and open Youtube");

    }
}
