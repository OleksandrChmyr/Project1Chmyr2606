package Hometask3;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(
                "\n Assignment 1:      Используя класс Scanner, написать программу, " +
                        "\n                  которая будет запрашивать пользователя " +
                        "\n                  ввести данные о себе для регистрации и" +
                        "\n                  после введенных данных будет выводить всю информацию в консоль: ");
//        Создаем в этом классе.  Вызываем данный класс и метод.
//        Так как метод не статический создаем экземпляр класса.

//        Scanner myScan = new Scanner(System.in);
//
//        System.out.println("Enter your Name: ");
//        String name = myScan.next();
//        System.out.println("Your Name is: " + name);
//
//        System.out.println("Enter your Surname: ");
//        String surname = myScan.next();
//        System.out.println("Your Surname is: " + surname);
//
//        System.out.println("How old are you?: ");
//        int age = myScan.nextInt();
//        System.out.println("Your Age is: " + age);
//
//        System.out.println("Please Enter your email: ");
//        String email = myScan.next();
//        System.out.println("Your email is: " + email);
//
//        System.out.println("TelL me about yourself: ");// не останавливается на строке
//        String story = myScan.nextLine();
//        System.out.println("Your story is interesting: " + story);
//
//        System.out.println("Assignment 1: completed");


        System.out.println("Assignment 2: Создайте 3 переменные типа int и 3 переменные типа double используя " +
                "класс Random, выполните их сложение и выведите результат. ");

        Random random1 = new Random();
        int i1 = random1.nextInt(151) + 1;
        int i2 = random1.nextInt(151) + 1;
        int i3 = random1.nextInt(151) + 1;
        double d1 = random1.nextDouble() + 1;
        double d2 = random1.nextDouble() + 1;
        double d3 = random1.nextDouble() + 1;

        System.out.println("Результат сложения: " + (i1 + i2 + i3 + d1 + d2 + d3));

        System.out.println("Assignment 2: completed");


        System.out.println("Assignment 3: Создать метод, для розыгрыша приза в лотерее среди участников. " +
                "Внутри метода сделать возможным каждый раз при вызове вводить количество участников" +
                "(При запуске программы должно спрашивать количество участников(использовать Scanner), " +
                "вы задаете количество участников и среди них производится розыгрыш). " +
                "Используя класс Random определить победителя и вывести поздравление в консоль.");

        Scanner lotteryWinner = new Scanner(System.in);
        System.out.println("How many participants do we have today? Enter the number: ");
        int Participants = lotteryWinner.nextInt();
        System.out.println("Ok, we are ready to play with  " + Participants + " ladies and gentlement");

        Random LotteryRand = new Random();
        int Winner = LotteryRand.nextInt(Participants);
        int prizesum = LotteryRand.nextInt(1000000) + 10000;

        System.out.println("Our lucky Number today is ... " + Winner +
                "\n  Congratulations!!! You have won: " + prizesum + "  USD $$$$$$$$$");

        System.out.println("Assignment 4: Используя класс Math напишите 7-8 примеров вызовов вспомогательных методов " +
                "данного класса:\n" +
                " о sqrt();\n" +
                " o abs();\n" +
                " o min();\n" +
                " o max();\n" +
                " o random();\n" +
                " o ….(остальные на Ваш выбор);\n");

//        Math M1 = new Math();

        System.out.println("Assignment 5: Создать 2 схожих метода, которые будут случайным образом генерировать " +
                "Вашу зарплату. Обратите внимание, что именно метода, а не просто вызовы указанных функций. " +
                "В одном методе используйте класс Random, в другом Math.random. " +
                "Для себя поймите разницу в использовании. " +
                "Если не хотите получать маленькую зарплату, то можете выполнить дополнительные действия с Math.random)");


        System.out.println("Assignment 6: Создайте класс “Employee”, у которого будет три переменные: " +
                "double:“salary”, String:“position”, int:”age”. " +
                "Выполните определенные действия, чтобы сравнение сотрудников производилось не по ссылке, " +
                "а по значению полей. В классе Main создайте 2 одинаковых сотрудника и выполните сравнения " +
                "используя “==” и “equals()”. ");
        Employee Em1 = new Employee();
        Em1.age = 43;
        Em1.position = "Consultant";
        Em1.salary = 15000;

        Employee Em2 = new Employee();
        Em2.age = 43;
        Em2.position = "Consultant";
        Em2.salary = 15000;

        System.out.println("Сравнение по ссылке  " + (Em1 == Em2));
        System.out.println("Сравнение объектов  " + (Em1.equals(Em2)));


    }
}
