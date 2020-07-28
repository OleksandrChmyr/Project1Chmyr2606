package Hometask9;

import java.util.Objects;

public final class Bus extends Car implements StartEngine, SelectGear, HornSound{
    private int passengerNumber;
    private String busType;
    private boolean safetyBelts;

    public Bus() {
    }

    public Bus(String manufacturer, String modelName, String engineType, int travelRange,
               int length, int width, int passengerNumber, String busType, boolean safetyBelts) {
        super(manufacturer, modelName, engineType, travelRange, length, width);
        this.passengerNumber = passengerNumber;
        this.busType = busType;
        this.safetyBelts = safetyBelts;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public boolean isSafetyBelts() {
        return safetyBelts;
    }

    public void setSafetyBelts(boolean safetyBelts) {
        this.safetyBelts = safetyBelts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return passengerNumber == bus.passengerNumber &&
                safetyBelts == bus.safetyBelts &&
                Objects.equals(busType, bus.busType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerNumber, busType, safetyBelts);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerNumber=" + passengerNumber +
                ", busType='" + busType + '\'' +
                ", safetyBelts=" + safetyBelts +
                '}';
    }

    public void busStop () {
        System.out.println("Bus must stop to collect passengers");
    }

    @Override
    public void turnKey() {
        System.out.println("Bus driver turns the key on to start engine");

    }

    @Override
    public void ignitionStart() {
        System.out.println("The engine starts and the bus is ready to go");

    }

    @Override
    public void moveGearShifter() {
        System.out.println("The bus driver selects first gear on his manual gearbox");
    }

    @Override
    public void pushClutchPedal() {
        System.out.println("It is hard to push the clutch pedal for a young driver");
    }

    @Override
    public void hornSound() {
        System.out.println("Bus horn sounds loud and clear");
    }

    @Override
    public void pressHornButton() {
        System.out.println("The driver pushes horn sound to scare the birds");
    }
}
