package Hometask4;

public class Conditional {
    public void whileTask1(int counter) {
        int i = 1;
        while (i <= counter) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        System.out.println("Exited");
    }

    public void forTask2(int counter) {
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println("Exited");
    }

    public void whileTask3(int i) {
        while (i >= 0) {
            System.out.print(i + ", ");
            i -= 10;
        }
        System.out.println(" ");
        System.out.println("Exited");
    }

    public void forTask4(int n) {
        for (int i = n; i >= 0; i -= 10) {
            System.out.print(i + ", ");
        }
        System.out.println(" ");
        System.out.println("Exited");
    }
}

