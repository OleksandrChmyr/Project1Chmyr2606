package Hometask2;

import java.util.Arrays;

public class Main {
    /**
     * @param args
     * Комментарий - признак плохого запаха!
     * Смысл в том, что в одном месте (java-файле), например для методов, перед собственно кодом
     * описываешь стандартным образом что функция делает, какие аргументы принимает, какие результаты возвращает.
     */
    public static <string> void main(String[] args) {
        System.out.println("Hometask 2. Date 21.06.2020");
        System.out.println("Assignment 1: Создать переменную = 1 и используя инкремент и декремент напечатать:");

        int variableA1 = 1;
        System.out.println(variableA1--);
        System.out.println(variableA1++);
        System.out.println(variableA1--);
        System.out.println(++variableA1);
        System.out.println(variableA1++);
        System.out.println(variableA1--);
        System.out.println(variableA1--);
        System.out.println(++variableA1);

        System.out.println("Assignment 1: completed");

        System.out.println("Assignment 2: Условно создать таблицу из столбцов и строк всех 8 примитивов и " +
                "выполнить преобразование один к другому.");
//        Прикрепленный файл "Преобразование примитивов_Таблица.jpg"
        System.out.println("Задание выполнено в отдельном файле.");
        System.out.println("Assignment 2: completed");

        System.out.println("Assignment 3: Создать 3 целочисленных и 3 дробных переменных, выполнить несколько " +
                "неявных преобразований и вывести сумму всех 6 переменных преобразовав к строке(тип String);");
//       3 целочисленных переменных:
        byte A3Byte = 10;
        short A3Short = 4;
        int A3int = 13;
//       3 дробных переменных:
        float A3float = 3.14F;
        float A3float1 = 15.47F;
        float A3float2 = 34.11F;


// проводим неявные преобразования 6 переменных:
        short s1 = A3Byte;
        int i1 = A3Short;
        long l1 = A3int;
        double d1 = A3float;
        double d2 = A3float1;
        double d3 = A3float2;
// вывести сумму всех 6 переменных преобразовав к строке
        System.out.println(Arrays.toString(new double[]{s1 + i1 + l1 + d1 + d2 + d3}));
        System.out.println("Assignment 3: completed");

        System.out.println("Assignment 4: Создавать комментарии всех рассмотренных видов хотя бы по одному примеру;");
//        Это "Линейный комментарий": комментарии в языке Java, как и в большинстве других языков программирования,
//        игнорируются при выполнении программы. Таким образом, в программу можно добавлять столько комментариев,
//        сколько потребуется, не опасаясь увеличить ее объем.

        /*Это блочный комментарий:
        * Если нужны более длинные комментарии, можно каждую строку начинать символами.
        * Хотя более удобно ограничивать блоки комментариев разделителями*/ int IntCommentPurpose = 1;

//todo: Задача - выучить JAVA и работать разработчиком ПО!

//        Javadoc комментарий находится в методе main.

        System.out.println("Assignment 4: completed");

        System.out.println("Assignment 5: Создать одномерный массив любого размера. Записать в него 10 примитивов. " +
                "\nЗначение в ячейках, индекс которых имеет нечетное значение, увеличить вдвое.  " +
                "\nЗначение в ячейках, индекс которых имеет четное значение, уменьшить на 2. " +
                "\nВывести значение массива до изменения и после для сравнения результата. ");

        int[] ints = new int[] {4,1,6,5,8,7,12,9,10,3};
        System.out.println("Массив ints до изменения: " + Arrays.toString(ints));

        // Вывод элементов массива с нечетным индексом на экран.
        System.out.print("\nЭлементы массива ints с нечетным индексом: ");
        for (int i = 0; i < ints.length; i++) {
            if(i%2 != 0){
                System.out.print("\nнечетный индекс " + i + " = " + ints[i] + ", ");
            }
        }

        // Вывод элементов массива с четным индексом на экран.
        System.out.print("\nЭлементы массива ints с четным индексом: ");
        for (int i = 0; i < ints.length; i++) {
            if(i%2 == 0){
                System.out.print("\nчетный индекс " + i + " = " + ints[i] + ", ");
            }
        }

        // Значение в ячейках, индекс которых имеет нечетное значение, увеличить вдвое.
        System.out.print("\nЗначение в ячейках, индекс которых имеет нечетное значение, увеличить вдвое: ");
        for (int i = 0; i < ints.length; i++) {
            if(i%2 != 0){
                System.out.print(ints[i] * 2 + ",");
            }
        }
        // Значение в ячейках, индекс которых имеет четное значение, уменьшить на 2.
        System.out.print("\nЗначение в ячейках, индекс которых имеет четное значение, уменьшить на 2: ");
        for (int i = 0; i < ints.length; i++) {
            if(i%2 == 0){
                System.out.print(ints[i] / 2 + ",");
            }
        }
        System.out.println("\nМассив ints после изменения: ");
        for (int i = 0; i < ints.length; i++) {
            if(i%2 != 0){
                System.out.print(ints[i] * 2 + ",");
            }
            if(i%2 == 0){
                System.out.print(ints[i] / 2 + ",");
            }

        }

      System.out.println("\nAssignment 5: completed");

      System.out.println("\nAssignment 6: Создайте многомерный массив, в котором будет 3 строки и 3 столбца. " +
                "Запишите в него числа от 1 до 9. \n" +
                "Выполните с данным массивом определенные действия, чтобы числа хранились от 9 до 1. \n" +
                "Выведите результат до и после изменения многомерного массива.\n" );
        int [][] matrixInts = new int[3][3];
        matrixInts [0][0] = 1;
        matrixInts [0][1] = 2;
        matrixInts [0][2] = 3;
        matrixInts [1][0] = 4;
        matrixInts [1][1] = 5;
        matrixInts [1][2] = 6;
        matrixInts [2][0] = 7;
        matrixInts [2][1] = 8;
        matrixInts [2][2] = 9;

        System.out.println("Двумерный массив, в котором  3 строки и 3 столбца. \n" +
                "               \n Записано числа от 1 до 9:  " + Arrays.deepToString(matrixInts));

// Вывод массива столбиками:
        System.out.println("Вывод в матричном виде: ");
        for (int i = 0; i < matrixInts.length; i++) {  //идём по строкам
            for (int j = 0; j < matrixInts.length; j++) {//идём по столбцам
                System.out.print(" " + matrixInts[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

 // Вывод значений в обратном порядке:
        System.out.println("Вывод значений в обратном порядке от 9 до 1:");
        for (int i = matrixInts.length-1; i >= 0; i--) {
            for (int j = matrixInts.length-1; j >= 0; j--) {
                System.out.print(" " + matrixInts[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Assignment 6: completed");
    }
    }

