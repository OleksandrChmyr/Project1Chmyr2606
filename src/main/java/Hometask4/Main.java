package Hometask4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // для создания отдельных методов используем созданный класс Conditional
        System.out.println("Assignment1: 1. Вывести на экран числа от 1 до 10 используя while.\n" +
                "Пример: 1 2 3 4 5 6 7 8 9 10\n" +
                "Реализовать в отдельном методе.\n");
        Conditional conditional = new Conditional();// Вызываем метод с созданием экземпляра класса, так как метод не static
        conditional.whileTask1(10);

        System.out.println("Assignment 1: completed\n");

        System.out.println("Assignment 2: 2. Вывести на экран числа от 1 до 10 используя for.\n" +
                "Пример: 1 2 3 4 5 6 7 8 9 10\n" +
                "Реализовать в отдельном методе.\n");
        // Экземпляр класса уже создан, вызываем метод:
        conditional.forTask2(10);
        System.out.println("Assignment 2: completed\n");

        System.out.println("Assignment 3: 3. Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. \n" +
                "Использовать while.\n" +
                "Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0\n" +
                "Реализовать в отдельном методе.\n");
        // Экземпляр класса уже создан, вызываем метод:
        conditional.whileTask3(100);
        System.out.println("Assignment 3: completed\n");

        System.out.println("Assignment 4: 4. Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц.\n" +
                " Использовать for.\n" +
                "Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0\n" +
                "Реализовать в отдельном методе.\n");
// Экземпляр класса уже создан, вызываем метод:
        conditional.forTask4(100);
        System.out.println("Assignment 4: completed\n");

        System.out.println("Assignment 5: 5. Дано 10 чисел (возможно массив). \n" +
                "Напечатайте наибольшее из них в консоль, используя циклические и условные операторы.\n");
        int[] randArray1 = new int[10];
        Random randomint1 = new Random();

        for (int a = 0; a < randArray1.length; a++) {
            randArray1[a] = randomint1.nextInt(100);
        }
        for (int a = 0; a < randArray1.length; a++) {
            System.out.print(randArray1[a] + ", ");
        }

        int max = randArray1[0];
        for (int a = 0; a < randArray1.length; a++) {
            if (max < randArray1[a])
                max = randArray1[a];
        }
        System.out.println("\n Maximum values is: " + max);
        System.out.println("Assignment 5: completed");

        System.out.println("\n Assignment 6: Дано 10 чисел (возможно массив). \n" +
                "Напечатайте наименьшее из них в консоль, используя циклические и условные операторы.\n");
        int[] randArray2 = new int[10];
        Random randomint2 = new Random();

        for (int b = 0; b < randArray2.length; b++) {
            randArray2[b] = randomint2.nextInt(100);
        }
        for (int b = 0; b < randArray2.length; b++) {
            System.out.print(randArray2[b] + ", ");
        }

        int min = randArray2[0];
        for (int b = 0; b < randArray2.length; b++) {
            if (min > randArray2[b])
                min = randArray2[b];
        }
        System.out.println("\n Minimum values is: " + min);
        System.out.println("Assignment 6: completed");

        System.out.println("\n Assignment 7: Создайте переменную равную 5. " +
                "\n Используя один из циклических оператор, напечатайте “Hillel the Best” " +
                "пока созданная переменная меньше 0. " +
                "Текст необходимо чтобы вывелся только один раз.\n");
        int x = 5;
        while (x <= 5) {
            x--;
            if (x < 0) {
                System.out.println("Hillel the best");
                break;
            }
        }
        System.out.println("Assignment 7: completed");

        System.out.println("\n Assignment 8: Создайте массив из 10 чисел от 1 до 10. " +
                "В одном из циклических операторов пройдетесь по нему и выведете следующие сообщения:\n" +
                "о Если четное - “{число} - это четно число”\n" +
                "о Если не четное - “{число} - это число не четное”\n");
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 != 0) {
                System.out.println(intArray[i] + " - это число четное");}
                else {
                    System.out.println(intArray[i] + " - это число не четное");
                }
            }
        }

    }

