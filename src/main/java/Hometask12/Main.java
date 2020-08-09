package Hometask12;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Задание:
//        1. Создайте класс, в которому будут 3 отдельных метода, логика которых будет вызывать 3 разные
//        “проверяемые”(checked) ошибки. Ошибки можете вызвать принудительно в ходе какой-то логики(не принципиально);
        System.out.println("Assignment1: Работа трех методов, логика которых будет вызывать 3 разные ”проверяемые”(checked) ошибки:");
        EquationTestExample.mathTest(10,2);
//

//
//        2. Создайте еще один класс, у которого будет также три метода, которые просто будут вызывать по одному методу
//        первого класса. Эти методы не должны обрабатывать возможные ошибки, а просто пробрасывают полученную ошибку выше;
        System.out.println("Assignment2: Создан класс CallMyException");
//        --- создан класс CallMyException ---

//        3. В классе Main выполните вызовы методов второго класса используя конструкции:
        System.out.println("Assignment3: пробуем try-catch-finally");

//        а). try-catch-finally;
        tryCatchFinally();
//        б). try-catch-catch-finally;
        tryCatchCatchFinally();
//        в). try-catch-catch-catch-finally;
        tryCatchCatchCatchFinally();
//        г). try(with resources)-catch-finally;
        tryWithResourcesCatchFinally();
//        д). try-finally;
        tryFinally();
//        (в каждой конструкции try должны быть вызовы 3х методов промежуточного класса с разными ошибками).



    }
    private static void tryCatchFinally () {
        try {
            CallMyException.callMyFirstException();
            CallMyException.callMySecondException();
            CallMyException.callMyThirdException();
        } catch (Exception e) {
            System.out.println("Отработал метод Try-Catch-Finally - catch");
            e.printStackTrace();

        } finally {
            System.out.println("finally(пишется в любом случае)");
        }

    }

    private static void tryCatchCatchFinally () {
        try {
            CallMyException.callMyFirstException();
            CallMyException.callMySecondException();
            CallMyException.callMyThirdException();
        } catch (IOException e) {
            System.out.println("Отработал метод Try-Catch-Catch-Finally - 1/2");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Отработал метод Try-Catch-Catch-Finally - 2/2");
            e.printStackTrace();
        } finally {
            System.out.println("finally (пишется в любом случае)");
        }
    }

    private static void tryCatchCatchCatchFinally () {
        try {
            CallMyException.callMyFirstException();
            CallMyException.callMySecondException();
            CallMyException.callMyThirdException();
        } catch (IOException e) {
            System.out.println("Отработал метод Try-Catch-Catch-Catch-Finally 1/3");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Отработал метод Try-Catch-Catch-Catch-Finally 2/3");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Отработал метод Try-Catch-Catch-Catch-Finally 3/3");
            e.printStackTrace();
        } finally {
            System.out.println("finally (пишется в любом случае)");
        }
    }

    private static void tryWithResourcesCatchFinally() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Test: \n question 1:\n" + 10 + "/ x = " + 5 + "\n Please find -x- and write down your answer");
            int answer = scanner.nextInt();
            int correctAnswer = Math.abs(10/5);
            if (correctAnswer == answer) {
                System.out.println("The answer is correct");
            }

    } catch (Exception e){
              e.printStackTrace();
            } finally {
            System.out.println(" ");
        }
    }

        private static void tryFinally () {
        try {
            try {
                EquationTestExample.mathTest2();
            } catch (Exception e) { /// добавлено дополнительное условие try-catch для обработки ошибки в методе try-finally,
                // так как в данном методе заданием не предусмотрена обработка ошибки
                e.printStackTrace();
            }

        } finally {
            try { // Реализовано дополнительную связку try-catch для вызова 3-х методов промежуточного класса согласно условий задачи
            CallMyException.callMyFirstException();
            CallMyException.callMySecondException();
            CallMyException.callMyThirdException();
        } catch (Exception e) {
            e.printStackTrace();
        }


        }

    }
}
