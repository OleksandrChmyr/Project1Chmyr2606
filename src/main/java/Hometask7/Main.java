package Hometask7;

public class Main {
    private static Object House;

    public static void main(String[] args) {
        
        Sofa mySofa = new Sofa();
        mySofa.setMaterial("cloth");
        mySofa.setType("couch");
        mySofa.setPillowsNum(2);
        mySofa.setPersonsSitsNum(3);

        Table myTable = new Table();
        myTable.setMaterial("metal");
        myTable.setType("bureau");
        myTable.setLength(120);
        myTable.setWidth(80);

        Wardrobe myWardrobe = new Wardrobe();
        myWardrobe.setMaterial("wood");
        myWardrobe.setModel("ClothingWardrobe");
        myWardrobe.setDoorNumber(2);
        myWardrobe.setPrice(2400);

        House myHouse = new House();
        myHouse.setMySofa(String.valueOf(mySofa));
        myHouse.setMyTable(String.valueOf(myTable));
        myHouse.setMyWadrobe(String.valueOf(myWardrobe));

        System.out.println(myHouse);
    }
}
