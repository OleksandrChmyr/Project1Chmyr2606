package Hometask8.HT_8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Support extends User {

    public Support() {
    }

    public Support(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }

    public static boolean stringVer (String str) throws IOException {

        FileReader fileReader = new FileReader(Constants.path);
        Scanner fileScanner = new Scanner(fileReader);
        while (fileScanner.hasNextLine()) {
            String searchText = fileScanner.nextLine();
            if (searchText.equalsIgnoreCase(str)) {
                System.out.println("Text found");
                return true;

            }
            else {
                System.out.println("Text not found");
            }
        }
        fileReader.close();
        fileScanner.close();
        return true;

    }
}
