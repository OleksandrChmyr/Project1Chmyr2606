package Hometask8.HT_8;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        User user = new User();
        String str = Constants.finStr1;
        user.read(str);
        user.write();

        Support support = new Support();
        String str2 = Constants.finStr2;
        String str3 = "Alex";

        boolean delFile = support.stringVer(str3);

        Admin admin = new Admin();
        admin.stringVer(str3);
        admin.deleteFile(delFile);

// 6. Далее имея все необходимые классы, зная принцип “динамической диспетчеризации методов”
// и команду “instanceof” создайте метод, который будет принимать на вход User(какого-то)
// и в зависимости от типа вызывать методы:
//
//User = написать строку
//
//Support = написать строку + проверить наличие этой строки в файле
//
//Admin = написать строку + проверить + удалить файл, если такая строка найдена.

        dynamicDispatchExample(user);
        dynamicDispatchExample(support);
        dynamicDispatchExample(admin);
    }



    private static void dynamicDispatchExample (User user) throws IOException {
        if (user instanceof User) {
            user.write();
        }

        if (user instanceof Support){
            user.write();
            String str4 = "Dima";
            ((Support) user).stringVer(str4);
        }
        if (user instanceof Admin) {
            user.write();
            String str5 = "Alex";
            ((Admin) user).stringVer(str5);
            boolean delFile = ((Admin) user).stringVer(str5);
            ((Admin) user).deleteFile(delFile);
        }

    }
}
