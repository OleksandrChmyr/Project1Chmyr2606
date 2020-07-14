package Hometask7;

import java.util.Objects;

public class House {
    private String mySofa;
    private String myTable;
    private String myWardrobe;


    public House(String mySofa, String myTable, String myWardrobe) {
        this.mySofa = mySofa;
        this.myTable = myTable;
        this.myWardrobe = myWardrobe;
    }

    public House() {

    }



    public String getMySofa() {
        return mySofa;
    }

    public void setMySofa(String mySofa) {
        this.mySofa = mySofa;
    }

    public String getMyTable() {
        return myTable;
    }

    public void setMyTable(String myTable) {
        this.myTable = myTable;
    }

    public String getMyWadrobe() {
        return myWardrobe;
    }

    public void setMyWadrobe(String myWadrobe) {
        this.myWardrobe = myWadrobe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Objects.equals(mySofa, house.mySofa) &&
                Objects.equals(myTable, house.myTable) &&
                Objects.equals(myWardrobe, house.myWardrobe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mySofa, myTable, myWardrobe);
    }

    @Override
    public String toString() {
        return "House{" +
                "mySofa='" + mySofa + '\'' +
                ", myTable='" + myTable + '\'' +
                ", myWardrobe='" + myWardrobe + '\'' +
                '}';
    }
}
