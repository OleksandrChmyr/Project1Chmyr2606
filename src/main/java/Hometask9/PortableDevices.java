package Hometask9;

import java.util.Objects;

public abstract class PortableDevices extends Device {
    private int displaySize;
    private int displayResolution;
    private boolean keyboardExists;

    public PortableDevices() {
    }

    public PortableDevices(String manufacturer, String modelName, boolean displayExists,
                           int displaySize, int displayResolution, boolean keyboardExists) {
        super(manufacturer, modelName, displayExists);
        this.displaySize = displaySize;
        this.displayResolution = displayResolution;
        this.keyboardExists = keyboardExists;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public int getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayResolution(int displayResolution) {
        this.displayResolution = displayResolution;
    }

    public boolean isKeyboardExists() {
        return keyboardExists;
    }

    public void setKeyboardExists(boolean keyboardExists) {
        this.keyboardExists = keyboardExists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PortableDevices that = (PortableDevices) o;
        return displaySize == that.displaySize &&
                displayResolution == that.displayResolution &&
                keyboardExists == that.keyboardExists;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), displaySize, displayResolution, keyboardExists);
    }

    @Override
    public String toString() {
        return "PortableDevices{" +
                "displaySize=" + displaySize +
                ", displayResolution=" + displayResolution +
                ", keyboardExists=" + keyboardExists +
                '}';
    }

    public void portable () {
        System.out.println("You can carry your portable device wherever you go");
    }
}
