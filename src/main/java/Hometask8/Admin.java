package Hometask8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Admin extends User {
    private boolean delFile;


    public Admin() {
    }

    public Admin(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }

    public Admin(boolean delFile) {
    }



    public static void deleteFile(boolean delFile) {
        String path4 = "src/main/resources/Hometask8/1/User2.txt";

        File file1 = new File(path4);

        if (delFile == true) {
            file1.delete();

            System.out.println("File is NOW deleted");

        } else {
            System.out.println("File is NOT deleted");

        }
    }
}




