package Hometask9;

import java.util.Objects;

public final class OffroadCar extends Car implements StartEngine, SelectGear, HornSound{
    private int wheelDiameter;
    private String tyresType;
    private boolean winchExists;

    public OffroadCar() {
    }

    public OffroadCar(String manufacturer, String modelName, String engineType, int travelRange,
                      int length, int width, int wheelDiameter, String tyresType, boolean winchExists) {
        super(manufacturer, modelName, engineType, travelRange, length, width);
        this.wheelDiameter = wheelDiameter;
        this.tyresType = tyresType;
        this.winchExists = winchExists;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public String getTyresType() {
        return tyresType;
    }

    public void setTyresType(String tyresType) {
        this.tyresType = tyresType;
    }

    public boolean isWinchExists() {
        return winchExists;
    }

    public void setWinchExists(boolean winchExists) {
        this.winchExists = winchExists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OffroadCar that = (OffroadCar) o;
        return wheelDiameter == that.wheelDiameter &&
                winchExists == that.winchExists &&
                Objects.equals(tyresType, that.tyresType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wheelDiameter, tyresType, winchExists);
    }

    @Override
    public String toString() {
        return "offroadCar{" +
                "wheelDiameter=" + wheelDiameter +
                ", tyresType='" + tyresType + '\'' +
                ", winchExists=" + winchExists +
                '}';
    }

    public void offRoad () {
        System.out.println("An off-road car can go in the wilds, where there are no roads");
    }

    @Override
    public void turnKey() {
        System.out.println("New offroad car has the button on to start engine");

    }

    @Override
    public void ignitionStart() {
        System.out.println("The engine starts and the car is ready to conquer the mud hills");

    }

    @Override
    public void moveGearShifter() {
        System.out.println("The  driver selects D mode on his automatic gearbox");
    }

    @Override
    public void pushClutchPedal() {
        System.out.println("we don't need the clutch pedal any more");
    }

    @Override
    public void hornSound() {
        System.out.println("Off-road car horn sounds deeply");
    }

    @Override
    public void pressHornButton() {
        System.out.println("The driver pushes horn sound to greet the fans");
    }
}
