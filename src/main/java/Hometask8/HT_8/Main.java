package Hometask8.HT_8;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        User user = new User();
        String str = Constants.finStr1;
        User.read(str);
//        user.write();

        Support support = new Support();
        String str2 = Constants.finStr2;
        String str3 = "Alex";

        boolean delFile = Support.stringVer(str3);

        Admin admin = new Admin();
        Admin.deleteFile(delFile);


    }
}
