package Lesson16Final;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Validator {

    public static boolean validateColour(String colour) {
        return colour != null
                && !colour.trim().isEmpty()
                && !colour.trim().contains(" ");
    }

//        if (colour.equals(null)) {
////            return false;
////        }
//          if (colour.trim().isEmpty()){
//            return false;
//        }
//
//        if (colour.trim().contains(" ")) {
//        return false}
//    }
//    return true;
//}

    public static boolean checkModel(String model) {
        String path = "src/main/resources/Lesson16/Car";
        boolean exist = false;
        try (FileReader fileReader = new FileReader(path); Scanner scanner = new Scanner(fileReader)) {
            while (scanner.hasNextLine()) {
                String readLine = scanner.nextLine();
                if (readLine.equalsIgnoreCase(model)) {
                    exist = true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Read file exception: ");
            e.printStackTrace();
        }
        return exist;
    }

    private static ArrayList <Integer> dowloadIds() {
        ArrayList <Integer> carIds = new ArrayList<>();
        String idFile = "src/main/resources/Lesson16/id";
        try (FileReader idFileReader = new FileReader(idFile); Scanner fileScanner = new Scanner(idFileReader)) {
            while (fileScanner.hasNextInt()) {
                carIds.add(fileScanner.nextInt());

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Read file exception: ");
            e.printStackTrace();
        }
        return carIds;
    }

    public static Integer checkID () {

        Random randomId = new Random();
        int id = randomId.nextInt(99)+1;
        ArrayList <Integer> ids = dowloadIds();
        if (ids.size()>100) {
            System.out.println("List is full");
            return 0;
        }
        while (ids.contains(id)){
            id = randomId.nextInt(99)+1;
            }
        return id;
    }
}