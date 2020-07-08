package Hometask5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Assignment 1: 1. Дана строка: “ Hillel is my future. I will become a developer   ”");// Прим.Изначальная строка была подправлена ;)
        String str = " Hillel is my future. I will become a developer   ";
//          1.1 Проверить не пустой ли заданный текст
        System.out.println("1.1 Проверить не пустой ли заданный текст: " +
                "\n проверяем с помощью метода .isEmpty: " + str.isEmpty());

//          1.2 Вывести длину данного текста;
        System.out.println("1.2 Вывести длину данного текста - делаем c помощью метода str.length(): " + str.length());

//          1.3 Вывести длину данного текста убрав лишние пробелы вначале и конце текста;
        System.out.println("1.3 Вывести длину данного текста убрав лишние пробелы вначале и конце текста - " +
                "\n используем сразу два метода .trim и .length: " + str.trim().length());

//          1.4 Используя команду получения значения из строки по индексу вывести “I”;
        System.out.println("1.4 Используя команду получения значения из строки по индексу вывести “I”: ");
//        Способ 1: С преобразованием строки в массив символов:
        char[] chars = str.toCharArray();
        System.out.println("Способ 1: С преобразованием строки в массив: " + chars[22]);
//        Способ 2: С помощью метода str.charAt();
        char ch = str.charAt(22);
        System.out.println("Способ 2: С помощью метода str.charAt(): " + ch);

//          1.5 Используя команду обрезания вывести “developer”;
        System.out.println("1.5 Используя команду обрезания вывести “developer” - " +
                "\n делаем с помощью метода .substring: " + str.substring(38,47));
//
//          1.6 Добавить в конце строки знак “!”;
        // Способ 1: - с помощью "+"
//        str += " !";
//        System.out.println(str);
        // Способ 2: - с помощью метода .concat
        String concatStr = str.trim().concat(" !");
        System.out.println("1.6 Добавить в конце строки знак “!”: " + concatStr);

//          1.7 Выполните сравнение заданной строки со строкой: “Hillel is my feature. I will be DEVELOPER” так,
//          чтобы в одном случае они были равны, а в другом не равны;
        String str2 = "Hillel is my future. I will become a DEVELOPER";
        System.out.println("1.7 Выполните сравнение заданной строки со строкой: “Hillel is my future. I will become a DEVELOPER”" +
                "\n Строки не равны: " + str.equals(str2) +
                "\n Строки равны: " + str.trim().equalsIgnoreCase(str2));

//          1.8 Выведите данную строку в нижнем регистре;
        System.out.println("1.8 Выведите данную строку в нижнем регистре" +
                "\n Выводим с помощью метода str.toLowerCase(): " + str.trim().toLowerCase());

//          1.9 Выведите данную строку в верхнем регистре;
        System.out.println("1.9 Выведите данную строку в верхнем регистре" +
                "\n Выводим с помощью метода str.toUpperCase(): " + str.trim().toUpperCase());

        System.out.println("Assignment 1: completed\n");

        System.out.println("Assignment 2: Используя таблицу Unicode напечатайте 5 “необычных” символов, " +
                "выберите из отправленной таблицы символов;\n");
//        Способ 1:
        char u1 = 0x0110;
        char u2 = 0x0197;
        char u3 = 0x015E;
        char u4 = 0x0187;
        char u5 = 0x00D8;
        char u6 = 0x0056;
        char u7 = 0x0118;
        char u8 = 0x0158;
        char u9 = 0x0176;

        System.out.print("Способ 1: " + u1);
        System.out.print(u2);
        System.out.print(u3);
        System.out.print(u4);
        System.out.print(u5);
        System.out.print(u6);
        System.out.print(u7);
        System.out.print(u8);
        System.out.print(u9);
        System.out.println(" ");

//        Способ 2:
        char[] array = new char[]{0x0110,0x0197,0x015E,0x0187,0x00D8,0x0056,0x0118,0x0158,0x0176};
        System.out.println("Cпособ 2: ");
        for (char c : array) {
            System.out.print(c);
        }
        System.out.println("\nAssignment 2: completed");

        System.out.println("\nAssignment 3: Необходимо записать любое четверостишие в файл и считать.Условия:\n" +
                " о Директории, в которую будет запись файла, может изначально не существовать. Необходимо это учесть;\n" +
                " о Файл соответственно должен создаваться при записи;\n" +
                " о После записи необходимо проверить все ли записалось и вывести сообщение об успешной записи;\n" +
                " о В завершение необходимо считать стих из созданного файла и вывести в консоль.\n");
        write();
        read();


        System.out.println("\n Assignment 3: completed");

        System.out.println("\n Assignment 4: Написать программу “registration”. Условия:\n");
        registration();

        System.out.println("\n Assignment 4: completed");

        System.out.println("\n Assignment 5:  Написать программу “login”");

        login();

    }
    private static void write() throws IOException{

        String path = "src/main/resources/Hometask5P/1/HT_Poem.txt";
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent())) {
            Path directories = Files.createDirectories(pathToFile.getParent());
        }
        FileWriter poemWriter = new FileWriter(path);
        poemWriter.write("\tВы лежали в гамаке\n\tС сигаретою в руке\n\tИ невольно искривляли\n\tТело где-то в позвонке...");

        poemWriter.close();

    }
    private static void read() throws IOException{
        String path = "src/main/resources/Hometask5P/1/HT_Poem.txt";
        Path pathToFile = Paths.get(path);
        if (Files.exists(pathToFile.getParent())) {
            System.out.println("Успешная запись. Файл и путь создан.\n Вывод текста четверостишия: \n");

        }
        String str1 = "\tВы лежали в гамаке\n\tС сигаретою в руке\n\tИ невольно искривляли\n\tТело где-то в позвонке...";
        FileReader poemReader = new FileReader(path);
        Scanner poemScanner = new Scanner(poemReader);
        while (poemScanner.hasNextLine()) {
            String readLine = poemScanner.nextLine();
            if (readLine.equalsIgnoreCase(str1)) {
                return;
            }
            System.out.println(readLine);
        }
        poemReader.close();
        poemScanner.close();
    }
    private static void registration() throws IOException {
        Scanner regScan = new Scanner(System.in);

        System.out.println("Enter your login: ");
        String login = regScan.next();

        System.out.println("Enter your password: ");
        String pass = regScan.next();

        System.out.println("Confirm your password: ");
        String passcheck = regScan.next();
        if (!pass.equals(passcheck)) {
            System.out.println("Password does not match");
        } else {
            System.out.println("Registration completed");
            String path2 = "src/main/resources/Hometask5P/2/Users.txt";
            Path pathToFile = Paths.get(path2);
            if (!Files.exists(pathToFile.getParent())) {
                Path directories = Files.createDirectories(pathToFile.getParent());
            }
            FileWriter userWriter = new FileWriter(path2, true);
            userWriter.write(login);
            userWriter.write("\n");
            userWriter.write(pass);
            userWriter.write("\n");
            userWriter.close();
        }
    }
    private static void login () throws IOException{
        Scanner logScan = new Scanner(System.in);

        System.out.println("Enter your login: ");
        String enLogin = logScan.next();

        System.out.println("Enter your password: ");
        String enPass = logScan.next();

        String path2 = "src/main/resources/Hometask5P/2/Users.txt";
        Path pathToFile = Paths.get(path2);
        if (!Files.exists(pathToFile.getParent())) {
            return;
        }


        FileReader logReader = new FileReader(path2);
        Scanner fileScanner = new Scanner(logReader);
        while (fileScanner.hasNextLine()) {
            String name = fileScanner.nextLine();
            if (name.equalsIgnoreCase(enLogin)) {
                String password = fileScanner.nextLine();
                if (password.equalsIgnoreCase(enPass)) {
                    System.out.println("Welcome and enjoy");
                } else {
                    System.out.println("User or password not valid, please try again. You have 2 attempts left");
                    System.out.println("Enter your password: ");
                    String enPass1 = logScan.next();
                    if (password.equalsIgnoreCase(enPass1)) {
                        System.out.println("Welcome and enjoy");
                    } else {
                        System.out.println("User or password not valid, please try again. You have 1 attempts left");
                        System.out.println("Enter your password: ");
                        String enPass2 = logScan.next();
                        if (password.equalsIgnoreCase(enPass2)) {
                            System.out.println("Welcome and enjoy");
                        } else {
                            System.out.println("User or password not valid, please wait 30 min and try again later");
                        }
                    }
                }
            }
        }

        logReader.close();
        fileScanner.close();
        logScan.close();
    }
}

