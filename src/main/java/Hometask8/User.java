package Hometask8;

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
//2. Так же у данного класса должно быть 2 метода: 
//
//а). Читать. Принимает текст, ничего не возвращает, выводит сообщение принятое в консоль.

    public static void readUser() throws IOException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please,enter your Name: ");
        String name = scanner1.next();


        System.out.println("Please,enter your Surname: ");
        String surname = scanner1.next();

        System.out.println("Please,enter your email: ");
        String email = scanner1.next();

        System.out.println("Please,enter your password: ");
        String password = scanner1.next();

        System.out.println("Please,enter your sex: ");
        String sex = scanner1.next();

        System.out.println("Please,enter your country: ");
        String country = scanner1.next();


        System.out.println("Your Name is: " + name);
        System.out.println("Your Surname is: " + surname);
        System.out.println("Your email is: " + email);
        System.out.println("Your password is: " + password);
        System.out.println("Your sex is: " + sex);
        System.out.println("Your country is: " + country);
        System.out.println(" ");
    }

//    б). Писать. Ничего не принимает, просто считывает текст с клавиатуры и сохраняет введенный текст в файл. 
    public static void writeUser() throws IOException {
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("You need to register to continue. \n \nPlease,enter your Name: ");
        String name = scanner2.next();

        System.out.println("Please,enter your Surname: ");
        String surname = scanner2.next();

        System.out.println("Enter your email: ");
        String email = scanner2.next();

        System.out.println("Enter your password: ");
        String pass = scanner2.next();

        System.out.println("Confirm your password: ");
        String passcheck = scanner2.next();
        if (!pass.equals(passcheck)) {
            System.out.println("Password does not match");
        } else {
            System.out.println("Enter your sex: ");
            String sex = scanner2.next();

            System.out.println("Enter your country: ");
            String country = scanner2.next();

            System.out.println("Registration completed");
            String path = "src/main/resources/Hometask8/1/User2.txt";
            Path pathToFile = Paths.get(path);
            if (!Files.exists(pathToFile.getParent())) {
                Path directories = Files.createDirectories(pathToFile.getParent());
            }
            FileWriter userWriter = new FileWriter(path, true);
            userWriter.write(name);
            userWriter.write("\n");
            userWriter.write(surname);
            userWriter.write("\n");
            userWriter.write(email);
            userWriter.write("\n");
            userWriter.write(pass);
            userWriter.write("\n");
            userWriter.write(sex);
            userWriter.write("\n");
            userWriter.write(country);
            userWriter.write("\n");

            userWriter.close();
        }
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
}
