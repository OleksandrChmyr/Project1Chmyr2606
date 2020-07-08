package Lesson5;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        doWhileExample(array);
        forExample(array);
    }


    private static void doWhileExample(int[] array) {
        int count = 0;
        do {
            if (count % 2 == 0) {
                System.out.println("- четное " + array[count]);
            } else {
                System.out.println(" - не четное" + array[count]);
            }
            count++;
        } while (count != array.length);
    }

    private static void forExample(int[] array) {
//        for (int count = 0; count < array.length; count++) {  - сортировка по индексу
//            if (count % 2 == 0) {
//                System.out.println(" - четное " + array[count]);
//            } else {
//                System.out.println(" - не четное " + array[count]);
//            }
            for (int count = 0; count < array.length; count++) {
                if (array[count] % 2 == 0) {
                    System.out.println(" - четное " + array[count]);
                } else {
                    System.out.println(" - не четное " + array[count]);
                }
        }
        SwitchCase SwitchCase = new SwitchCase();
            SwitchCase.rootExample(2);

    }

}

