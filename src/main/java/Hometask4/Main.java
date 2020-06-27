package Hometask4;

public class Main {
    public static void main(String[] args) {

        Conditional conditional = new Conditional();
        conditional.whileExample1(10, 5);
        conditional.doWhileExample1("Do while test", 12);

        Conditional.forExample1(10);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        conditional.forExample2(array);

        int age = 22;
        int[] array2 = {1, 2, 3, 4};

        ifExample(age);
        ifExample2(age);
        ifExample3(age);
        continurBreakReturnExample(array);

    }


    private static void ifExample(int age) {
        if (age < 18) {
            System.out.println("You are so young!");
        } else if (age < 21) {
            System.out.println("Can buy cigarettes");
        } else {
            System.out.println("Can buy cigarettes and alcohol");
        }
    }

    private static void ifExample2(int age) {
        if (age < 18) {
            System.out.println("You are so young!");
        }
        if (age < 21) {
            System.out.println("Can buy cigarettes");
        }
        if (age >= 21) {
            System.out.println("Can buy cigarettes and alcohol");
        }
    }

    private static void ifExample3(int age) {
        String result = age > 18 ? "You are welcome" : "Do not have access";
//        String result = null;
//        if (age > 18) {
//            result = "You are welcome";
//        } else {
//            result = "Do not have access";
//        }
        System.out.println(result);
    }

    public static void continurBreakReturnExample(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i == 5) {
                break;
            }
            if (i == 6) {
                return;
            }
        }
        System.out.println("Exited");
    }
}
