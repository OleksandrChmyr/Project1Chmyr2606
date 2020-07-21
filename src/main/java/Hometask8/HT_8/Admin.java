package Hometask8.HT_8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//3. Создать 2 Класса-наследника от User: Support & Admin.
//Для этих классов необходимо определить все необходимые базовые методы для дальнейшей работы.
// \(Обратите внимание на последний пункт задачи и подумайте как реализовать наследование классов,
// чтобы были доступные методы описанные там)

public class Admin extends Support {
    public Admin() {
    }

    public Admin(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }

//    5. У класса Admin реализовать другой метод-удаления.
//    Данный метод на вход получает значение “содержит/ не содержит”
//    и в зависимости от этого значения удаляет файл(если содержит).

        public void deleteFile(boolean delFile) throws IOException {


        File file = new File(Constants.path);

        Path filePath = Paths.get(String.valueOf(file));


        if (delFile) {
            Files.delete(filePath);

        }
    }

}
