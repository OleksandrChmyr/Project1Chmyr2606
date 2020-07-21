package Hometask8.HT_8;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//3. Создать 2 Класса-наследника от User: Support & Admin.
//Для этих классов необходимо определить все необходимые базовые методы для дальнейшей работы.
// \(Обратите внимание на последний пункт задачи и подумайте как реализовать наследование классов,
// чтобы были доступные методы описанные там)

public class Support extends User {

    public Support() {
    }

    public Support(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }

//4. У класса Support определить дополнительный метод-проверки строки.
//Этот метод должен на вход принимать строку и проверять наличие этой строки в файле.
// Обратно возвращать значение “содержит/не содержит”(подумайте какая переменная лучше всего подходит для данного типа)

    public boolean stringVer (String str) throws IOException {

        FileReader fileReader = new FileReader(Constants.path);
        Scanner fileScanner = new Scanner(fileReader);
        while (fileScanner.hasNextLine()) {
            String searchText = fileScanner.nextLine();
            if (searchText.equalsIgnoreCase(str)) {
                fileReader.close();
                fileScanner.close();
                System.out.println("Text found");
                return true;

            }
        }
        fileReader.close();
        fileScanner.close();
        System.out.println("Text not found");
        return false;

    }
}

//


