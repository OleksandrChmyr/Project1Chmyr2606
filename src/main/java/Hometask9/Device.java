package Hometask9;

import java.util.Objects;

public abstract class Device implements OperationSystemStart, OpenApplications {
    private String manufacturer;
    private String modelName;
    private boolean displayExists;

    public Device() {
    }

    public Device(String manufacturer, String modelName, boolean displayExists) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.displayExists = displayExists;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean isDisplayExists() {
        return displayExists;
    }

    public void setDisplayExists(boolean displayExists) {
        this.displayExists = displayExists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return displayExists == device.displayExists &&
                Objects.equals(manufacturer, device.manufacturer) &&
                Objects.equals(modelName, device.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, modelName, displayExists);
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", modelName='" + modelName + '\'' +
                ", displayExists=" + displayExists +
                '}';
    }

    public void deviceHelps () {
        System.out.println("Devices help you to live in a modern world");
    }
}
