package Hometask6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(); // конструктор по умолчанию
        Cat barsik = new Cat("Barsik");
        Cat marsik = new Cat("Marsik", 3);
        Cat darsik = new Cat("Darsik", 4, "ball");

        Dog dog = new Dog();
        Dog sennenhund = new Dog("Sennenhund");
        Dog chuppy = new Dog("Chuppy", "Golden Retriever");
        Dog buddy = new Dog("Buddy", 12, "Mixed");

        System.out.println(cat);
        cat.setName("Tom");
        System.out.println(cat.getName());

        System.out.println(barsik);
        barsik.setName("Karsik");
        System.out.println(barsik.getName());

        System.out.println(marsik);
        marsik.setAge(4);
        System.out.println(marsik.getAge());

        System.out.println(darsik);
        darsik.setToy("Mouse");
        System.out.println(darsik.getToy());

        System.out.println("\n");
        System.out.println(dog);
        dog.setName("Milo");
        System.out.println(dog.getName());

        System.out.println(sennenhund);
        System.out.println(sennenhund.getBreed());
        sennenhund.setBreed("Berner Sennenhund");
        System.out.println(sennenhund.getBreed());

        System.out.println(chuppy);
        chuppy.setBreed("Labrador");
        System.out.println(chuppy.getBreed());

        System.out.println(buddy);
        buddy.setHeight(11);
        System.out.println(buddy.getHeight());
    }
}
