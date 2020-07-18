package Hometask8;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        User user1 = new User();
//        User.readUser();
//        User.writeUser();

        writeTest(); //- проверка


        Support support1 = new Support();
        boolean delFile = support1.UserSearch();

        Admin admin1 = new Admin(delFile);
        admin1.deleteFile(true);


//        support1.Verify();




    }
//    Тест удаления файла - для себя
    public static void writeTest() throws IOException {
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("You need to register to continue. \n \nPlease,enter your Name: ");
        String name = scanner2.next();

            String path = "src/main/resources/Hometask8/1/User2.txt";
            Path pathToFile = Paths.get(path);
            if (!Files.exists(pathToFile.getParent())) {
                Path directories = Files.createDirectories(pathToFile.getParent());
            }
            FileWriter userWriter = new FileWriter(path, true);
            userWriter.write(name);
            userWriter.write("\n");


            userWriter.close();
        }
    }

