package Hometask8.HT_8;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class User {
    //    1. Создайте класс User, у которого будет несколько полей(имя, фамилия, почта, пароль, пол, страна).
//    Соблюдая принципы инкапсуляции реализуйте в нем все необходимые методы/конструкторы для дальнейшей работы
//    (не забываем и про методы для сравнения классов и для печати переопределить).

    private String name;
    private String surname;
    private String email;
    private String password;
    private String sex;
    private String country;

    public User() {
    }

    public User(String name, String surname, String email, String password, String sex, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(sex, user.sex) &&
                Objects.equals(country, user.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, password, sex, country);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static void read (String readText) {
        System.out.println(readText);
    }

    public static void write () throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your text: ");
        String writeText = scanner.nextLine();


        Path pathToFile = Paths.get(Constants.path);
        if (!Files.exists(pathToFile.getParent())) {
            Path directories = Files.createDirectories(pathToFile.getParent());
        }
        FileWriter userWriter = new FileWriter(Constants.path, true);
        userWriter.write(writeText + "\n");

        userWriter.close();

    }
}
