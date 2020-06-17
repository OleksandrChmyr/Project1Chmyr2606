package Hometask1;

public class Main {
    public static void main(String[] args) {
        String title = "Hometask1_June 17th, 2020";
        String done = "Assignment completed";
        System.out.println(title);
        System.out.println("Assignment 1: Перейти по ссылке и зарегестрироваться в Slack. После чего написать мне в этой системе для проверки связи.");
        System.out.println(done);

        System.out.println("Assignment 2: Создайте все известные примитивы по 1 экземпляру(кроме int и double) и строку двумя разными способами. Создайте 3 переменные int в одну строку и 3 переменные double в одну строку.");

            byte byteName;
            byteName = 5;
            short shortName = 2;
            long longName = 5201;
            float floatName = 13.47F;
            char charName = 'o';
            boolean booleanName = true;
            boolean booleanName2 = false;

        String Primitives1 = "PrimitiveLine1";
        String Primitives2 = new String ("PrimitiveLine1");
            int intName1 = 15, intName2 = 27, intName3 = 33;
            double doubleName1 = 17.83, doubleName2 = 56.33, doubleName3 = 3.14;
        System.out.println(done);

        System.out.println("Assignment 3: С созданными переменными напишите 10 примеров с двумя любыми арифметическими операциями в каждом (5 дробных результата и 5 целочисленных) и выведите результаты");

        System.out.println("Arithmetic example 1: integer       " + (byteName + shortName + longName));
        System.out.println("Arithmetic example 2: integer       " + (longName - shortName * byteName));
        System.out.println("Arithmetic example 3: integer       " + (byteName * longName % shortName));
        System.out.println("Arithmetic example 4: integer       " + (longName / byteName + shortName));
        System.out.println("Arithmetic example 5: integer       " + (intName1 + intName2 + intName3));
        System.out.println("Arithmetic example 6: fractional    " + (doubleName1 + doubleName2 + doubleName3));
        System.out.println("Arithmetic example 7: fractional    " + (doubleName1 / floatName + doubleName3));
        System.out.println("Arithmetic example 8: fractional    " + (doubleName1 * floatName % doubleName3));
        System.out.println("Arithmetic example 9: fractional    " + (doubleName2 / doubleName1 + floatName));
        System.out.println("Arithmetic example 10: fractional   " + (doubleName3 / floatName * doubleName2));

        System.out.println(done);

        System.out.println("Assignment 4: Напишите 10 примеров с арифметическими операциями с присвоением и выведите результат");
        int grid = 2223;
        grid += 1;
        grid -= 3;
        grid *= 65;
        grid /=1000;
        grid %=23;
        System.out.println("Arithmetic example Stack1:          " + grid);

        int brid = 1212;
        brid += 22;
        brid -= 13;
        brid *=667;
        brid /=123;
        brid %=101;
        System.out.println("Arithmetic example Stack2:          " + brid);
        System.out.println(done);

        System.out.println("Assignment 5: Напишите не менее 5 разных примеров используя логические операции с выводом результатов (несколько значений \"true\" & несколько значений \"false\").");

        System.out.println(grid > 0);
        System.out.println(grid == 6);
        System.out.println(brid <= 158);
        System.out.println(charName == 0);
        System.out.println(intName1 <= 10);
        System.out.println(doubleName3 > 12);

        System.out.println(done);






    }
}
