package Hometask7;

import java.util.Objects;

public class Wardrobe {
    private String material;
    private String model;
    private int doorNumber;
    private int price;

    public Wardrobe() {
    }

    public Wardrobe(String material, String model, int doorNumber, int price) {
        this.material = material;
        this.model = model;
        this.doorNumber = doorNumber;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wardrobe wardrobe = (Wardrobe) o;
        return doorNumber == wardrobe.doorNumber &&
                price == wardrobe.price &&
                Objects.equals(material, wardrobe.material) &&
                Objects.equals(model, wardrobe.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, model, doorNumber, price);
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "material='" + material + '\'' +
                ", model='" + model + '\'' +
                ", doorNumber=" + doorNumber +
                ", price=" + price +
                '}';
    }
}
