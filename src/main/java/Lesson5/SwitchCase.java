package Lesson5;

import java.util.Scanner;

public class SwitchCase {
    public void rootExample(int command) {
        if (command == 1) {
            SwitchCaseintExample();
        } else {
            SwitchCaseStringExample();
        }
    }

    private void SwitchCaseStringExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Month of the Year");
        String month = scanner.next();
        switch (month) {
            case "Jan":
                System.out.println("Jan has 31 days");
                break;
            case "Feb":
                System.out.println("Feb has 29 days");
                break;
            default:
                System.out.println("I don't know such month");
                break;
        }

    }

    private void SwitchCaseintExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of the week: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("other day");// - дефолтное значение, которое не попало ни в один - не обязательно
//                Аналог if - else
        }
    }
}
