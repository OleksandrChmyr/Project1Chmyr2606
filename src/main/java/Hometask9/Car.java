package Hometask9;

import java.util.Objects;

public abstract class Car extends Vehicle implements StartEngine, SelectGear, HornSound{
    private int travelRange;
    private int length;
    private int width;

    public Car() {
    }

    public Car(String manufacturer, String modelName, String engineType, int travelRange, int length, int width) {
        super(manufacturer, modelName, engineType);
        this.travelRange = travelRange;
        this.length = length;
        this.width = width;
    }

    public int getTravelRange() {
        return travelRange;
    }

    public void setTravelRange(int travelRange) {
        this.travelRange = travelRange;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return travelRange == car.travelRange &&
                length == car.length &&
                width == car.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), travelRange, length, width);
    }

    @Override
    public String toString() {
        return "Car{" +
                "travelRange=" + travelRange +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    public void travel () {
        System.out.println("You can travel on a car");
    }
}
