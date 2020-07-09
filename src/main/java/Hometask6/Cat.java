package Hometask6;

public class Cat {
    String name;
    int age;
    String favoriteToy;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age, String favoriteToy) {
        this.name = name;
        this.age = age;
        this.favoriteToy = favoriteToy;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getToy() {
        return favoriteToy;
    }

    public void setName(String name) {
            this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favoriteToy='" + favoriteToy + '\'' +
                '}';
    }
}
