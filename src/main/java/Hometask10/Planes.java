package Hometask10;

import java.util.Objects;

public class Planes {
    private String planeType;
    private String manufacturerName;
    private String planeModelName;
    private int engineNumber;
    private int yearOfProduction;
    private int maxSpeed;

    public Planes() {
    }

    public Planes(String planeType, String manufacturerName, String planeModelName, int engineNumber, int yearOfProduction, int maxSpeed) {
        this.planeType = planeType;
        this.manufacturerName = manufacturerName;
        this.planeModelName = planeModelName;
        this.engineNumber = engineNumber;
        this.yearOfProduction = yearOfProduction;
        this.maxSpeed = maxSpeed;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getPlaneModelName() {
        return planeModelName;
    }

    public void setPlaneModelName(String planeModelName) {
        this.planeModelName = planeModelName;
    }

    public int getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(int engineNumber) {
        this.engineNumber = engineNumber;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planes planes = (Planes) o;
        return engineNumber == planes.engineNumber &&
                yearOfProduction == planes.yearOfProduction &&
                Objects.equals(planeType, planes.planeType) &&
                Objects.equals(manufacturerName, planes.manufacturerName) &&
                Objects.equals(planeModelName, planes.planeModelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeType, manufacturerName, planeModelName, engineNumber, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Planes{" +
                "planeType='" + planeType + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", planeModelName='" + planeModelName + '\'' +
                ", engineNumber=" + engineNumber +
                ", yearOfProduction=" + yearOfProduction +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public void fly (){
        System.out.printf("Plane can fly");
    }
}
