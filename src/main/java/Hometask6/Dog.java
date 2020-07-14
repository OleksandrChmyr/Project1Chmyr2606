package Hometask6;

public class Dog {
    String name;
    int height;
    String breed;

    public Dog() {

    }

    public Dog (String breed) {// ALt+ ins - Constructor - parameters
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, int height, String breed) {
        this.name = name;
        this.height = height;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", breed='" + breed + '\'' +
                '}';
    }
}
