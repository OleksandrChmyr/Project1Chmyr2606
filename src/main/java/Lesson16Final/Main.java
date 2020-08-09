package Lesson16Final;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to registration in Our AutoService!");
        final int resultId = Validator.checkID();
        if (resultId == 0) {
            return;
        }

        Scanner myScan = new Scanner(System.in);

        System.out.println("Enter your car model: ");
        String carModel = myScan.next();
        if (!Validator.checkModel(carModel)) {
            System.out.println("We don't work with " + carModel + " sorry!");
            return;
        }

        System.out.println("Enter your car colour");
        String carColour = myScan.nextLine();
        while (!Validator.validateColour(carColour)) {
            System.out.println("Your colour is not valid please try again: ");
            carColour = myScan.next();
        }

        Car car = new Car(resultId, carModel, carColour);
        System.out.println(car.toString());
        System.out.println("Is everything correct? Y/N:");
        String reply = myScan.next();
        if (reply.equalsIgnoreCase("Y")) {
            System.out.println("Thank you, the registration completed");
        } else {
            System.out.println("Registration aborted. \n Good Bye");
        }
    }
}
