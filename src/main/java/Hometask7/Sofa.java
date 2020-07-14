package Hometask7;

import java.util.Objects;

public class Sofa {

    private String material;
    private String type;
    private int pillowsNum;
    private int personsSitsNum;

    public Sofa() {
    }

    public Sofa(String material, String type, int pillowsNum, int personsSitsNum) {
        this.material = material;
        this.type = type;
        this.pillowsNum = pillowsNum;
        this.personsSitsNum = personsSitsNum;
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

    public int getPillowsNum() {
        return pillowsNum;
    }

    public void setPillowsNum(int pillowsNum) {
        this.pillowsNum = pillowsNum;
    }

    public int getPersonsSitsNum() {
        return personsSitsNum;
    }

    public void setPersonsSitsNum(int personsSitsNum) {
        this.personsSitsNum = personsSitsNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sofa sofa = (Sofa) o;
        return pillowsNum == sofa.pillowsNum &&
                personsSitsNum == sofa.personsSitsNum &&
                Objects.equals(material, sofa.material) &&
                Objects.equals(type, sofa.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(material, type, pillowsNum, personsSitsNum);
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "material='" + material + '\'' +
                ", type='" + type + '\'' +
                ", pillowsNum=" + pillowsNum +
                ", personsSitsNum=" + personsSitsNum +
                '}';
    }
}
