package Hometask4;

import java.util.Arrays;
import java.util.Scanner;

public class Conditional {
    public void whileExample1(int first, int second) {
        while (first > second) {
            System.out.println("first + second  " + (first + second));
            first--;
        }
        System.out.println("Exited");
    }

    public void doWhileExample1(String text, int counter) {
        do {
            System.out.println(text);
            counter--;
        } while (counter > 0);
    }

    public static void forExample1(int counter) {
        for (int i = 0; i < counter; i++) {
            System.out.println("counter: " + counter);

        }

    }

    public static void whileExample2() {
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        while (!exit.equals("x")) {
            System.out.println("Enter X for exit. ");
            exit = scanner.next();
        }
    }

    public void forExample2(int[] array) {
        System.out.println("Received array is: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) { // array.length.fori
            array[i] *= 5;// array[i] = array[i] * 5;
            System.out.println("Changed array in progress: " + Arrays.toString(array));
        }
        System.out.println("Changed array: " + Arrays.toString(array));
    }
}
