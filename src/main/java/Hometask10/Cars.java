package Hometask10;

import java.util.Objects;

public class Cars {
    private String carName;
    private String carType;
    private int carMaxSpeed;

    public Cars() {
    }

    public Cars(String carName, String carType, int carMaxSpeed) {
        this.carName = carName;
        this.carType = carType;
        this.carMaxSpeed = carMaxSpeed;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getCarMaxSpeed() {
        return carMaxSpeed;
    }

    public void setCarMaxSpeed(int carMaxSpeed) {
        this.carMaxSpeed = carMaxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return carMaxSpeed == cars.carMaxSpeed &&
                Objects.equals(carName, cars.carName) &&
                Objects.equals(carType, cars.carType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carType, carMaxSpeed);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carName='" + carName + '\'' +
                ", carType='" + carType + '\'' +
                ", carMaxSpeed=" + carMaxSpeed +
                '}';
    }

    public void carDrive () {
        System.out.println("Car can drive");
    }
}
