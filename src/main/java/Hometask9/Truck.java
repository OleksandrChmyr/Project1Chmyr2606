package Hometask9;

import java.util.Objects;

public final class Truck extends Car implements StartEngine, SelectGear, HornSound{
    private String cargoType;
    private int maxWeight;
    private boolean hazardMaterialCertificate;

    public Truck() {
    }

    public Truck(String manufacturer, String modelName, String engineType, int travelRange,
                 int length, int width, String cargoType, int maxWeight, boolean hazardMaterialCertificate) {
        super(manufacturer, modelName, engineType, travelRange, length, width);
        this.cargoType = cargoType;
        this.maxWeight = maxWeight;
        this.hazardMaterialCertificate = hazardMaterialCertificate;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public boolean isHazardMaterialCertificate() {
        return hazardMaterialCertificate;
    }

    public void setHazardMaterialCertificate(boolean hazardMaterialCertificate) {
        this.hazardMaterialCertificate = hazardMaterialCertificate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return maxWeight == truck.maxWeight &&
                hazardMaterialCertificate == truck.hazardMaterialCertificate &&
                Objects.equals(cargoType, truck.cargoType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargoType, maxWeight, hazardMaterialCertificate);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "cargoType='" + cargoType + '\'' +
                ", maxWeight=" + maxWeight +
                ", hazardMaterialCertificate=" + hazardMaterialCertificate +
                '}';
    }

    public void cargoDeliver () {
        System.out.println("A truck can deliver different cargos");
    }

    @Override
    public void turnKey() {
        System.out.println("Truck driver turns the key two times on to start engine on this old truck");

    }

    @Override
    public void ignitionStart() {
        System.out.println("The engine starts and but one cylinder is malfunctioning");

    }

    @Override
    public void moveGearShifter() {
        System.out.println("The truck driver selects first gear on his manual gearbox");
    }

    @Override
    public void pushClutchPedal() {
        System.out.println("The clutch pedal moves with ease");
    }

    @Override
    public void hornSound() {
        System.out.println("Truck horn sounds loud for safety reasons");
    }

    @Override
    public void pressHornButton() {
        System.out.println("The Truck driver pushes horn not to fall asleep");
    }
}
