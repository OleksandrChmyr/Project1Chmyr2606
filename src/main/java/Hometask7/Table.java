package Hometask7;

import java.util.Objects;

public class Table {

    private String material;
    private String type;
    private int length;
    private int width;

    public Table() {
    }

    public Table(String material, String type, int length, int width) {
        this.material = material;
        this.type = type;
        this.length = length;
        this.width = width;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        Table table = (Table) o;
        return length == table.length &&
                width == table.width &&
                Objects.equals(material, table.material) &&
                Objects.equals(type, table.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, type, length, width);
    }

    @Override
    public String toString() {
        return "Table{" +
                "material='" + material + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
