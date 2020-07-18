package Hometask8;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Support extends User {

    public Support() {

    }

    public Support(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }

//4. У класса Support определить дополнительный метод-проверки строки.
//Этот метод должен на вход принимать строку и проверять наличие этой строки в файле.
// Обратно возвращать значение “содержит/не содержит”(подумайте какая переменная лучше всего подходит для данного типа)

    public static boolean UserSearch() throws IOException {
        System.out.println("UserName search. Please enter user name: ");
        Scanner scanner3 = new Scanner(System.in);
        String userSearch = scanner3.next();

        String path3 = "src/main/resources/Hometask8/1/User2.txt";

        FileReader userReader = new FileReader(path3);
        Scanner userScanner = new Scanner(userReader);
        while (userScanner.hasNextLine()) {
            String name = userScanner.nextLine();
            if (name.equalsIgnoreCase(userSearch)) {
                System.out.println("User found");
                return true;

            } else {
                System.out.println("User not found");
                return false;
            }
        }
        userReader.close();
        userScanner.close();
        scanner3.close();
        return true;
    }

//            Тест для себя:
//
//            public static void Verify() throws IOException {
//                Scanner scanner4 = new Scanner(System.in);
//
//                System.out.println("You need to Log In to continue. \n \n Please enter your Email: ");
//                String enEmail = scanner4.next();
//
//                System.out.println("Please enter your password: ");
//                String enPass = scanner4.next();
//
//                String path4 = "src/main/resources/Hometask8/UserTest/1/User.txt";
//
//
//                FileReader logReader = new FileReader(path4);
//                Scanner fileScanner = new Scanner(logReader);
//                while (fileScanner.hasNextLine()) {
//                    String name = fileScanner.nextLine();
//                    if (name.equalsIgnoreCase(enEmail)) {
//                        System.out.println("User found");
//                        String password = fileScanner.nextLine();
//                        if (password.equalsIgnoreCase(enPass)) {
//                            System.out.println("Log In successful!");
//                        } else {
//                            int attempts = 3;
//                            for (int i = attempts; i > 0; i--) {
//                                System.out.println("User or password not valid, please try again. You have " + i + " attempts left");
//                                System.out.println("Enter your password: ");
//                                String enPass1 = scanner4.next();
//                                if (password.equalsIgnoreCase(enPass1)) {
//                                    System.out.println("Log In successful! ");
//                                } else {
//                                    System.out.println("User or password not valid, please wait 30 min and try again later");
//
//                                }
//                            }
//                        }
//                    }
//                }
//
//
//                logReader.close();
//                fileScanner.close();
//                scanner4.close();
//
//            }

        }


