package Hometask8.HT_8;

import java.io.File;
import java.io.IOException;

public class Admin extends Support {
    public Admin() {
    }

    public Admin(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }

        public static boolean deleteFile(boolean delFile) throws IOException {


        File file = new File(Constants.path);

        if (delFile) {
            file.delete();

            System.out.println("File is NOW deleted");
            return true;

        } else {
            System.out.println("File is NOT deleted");
            return false;

        }
    }

}
