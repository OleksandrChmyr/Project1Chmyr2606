package Hometask10;

import java.util.Objects;

public class Ships {
    private String name;
    private String type;
    private int displacement;
    private int passengersNumber;

    public Ships() {
    }

    public Ships(String name, String type, int displacement, int passengersNumber) {
        this.name = name;
        this.type = type;
        this.displacement = displacement;
        this.passengersNumber = passengersNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ships ships = (Ships) o;
        return displacement == ships.displacement &&
                passengersNumber == ships.passengersNumber &&
                Objects.equals(name, ships.name) &&
                Objects.equals(type, ships.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, displacement, passengersNumber);
    }

    @Override
    public String toString() {
        return "Ships{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", displacement=" + displacement +
                ", passengersNumber=" + passengersNumber +
                '}';
    }

    private void shipSail () {
        System.out.println("Ship can sail");
    }
}
