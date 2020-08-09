package Hometask12;

import java.util.Scanner;

public class EquationTestExample {

    public static void mathTest (int a, int b) throws Exception {


        Scanner testScanner = new Scanner(System.in);
        System.out.println("Test: \n question 1:\n" + a + "/ x = " + b + "\n Please find -x- and write down your answer");
        int answer = testScanner.nextInt();
        int correctAnswer = Math.abs(a/b);
            if (correctAnswer == answer) {
                System.out.println("The answer is correct");
            } if (answer == 0){
                MyExceptionMethods.firstException();
            } if (answer < correctAnswer) {
            MyExceptionMethods.secondException();
            } if (answer > correctAnswer) {
                MyExceptionMethods.thirdException();
        }
    }

    public static void mathTest2 () throws Exception {


        Scanner testScanner = new Scanner(System.in);
        System.out.println("Test: \n question 1:\n" + 10 + "/ x = " + 5 + "\n Please find -x- and write down your answer");
        int answer = testScanner.nextInt();
        int correctAnswer = Math.abs(10/5);
            if (correctAnswer == answer) {
                System.out.println("The answer is correct");
            } if (answer == 0){
                MyExceptionMethods.firstException();
            } if (answer < correctAnswer) {
            MyExceptionMethods.secondException();
            } if (answer > correctAnswer) {
                MyExceptionMethods.thirdException();
        }
    }

}
