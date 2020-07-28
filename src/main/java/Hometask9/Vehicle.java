package Hometask9;

import java.util.Objects;

public abstract class Vehicle implements StartEngine, SelectGear, HornSound{
    private String manufacturer;
    private String modelName;
    private String engineType;

    public Vehicle() {
    }

    public Vehicle(String manufacturer, String modelName, String engineType) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.engineType = engineType;
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

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(manufacturer, vehicle.manufacturer) &&
                Objects.equals(modelName, vehicle.modelName) &&
                Objects.equals(engineType, vehicle.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, modelName, engineType);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", modelName='" + modelName + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }

    public void drive () {
        System.out.println("A vehicle can drive");
    }
}
