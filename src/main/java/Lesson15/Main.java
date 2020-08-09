package Lesson15;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {

        try {
            exception();
            privateException();
        } catch (IOException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hello from finally!");
        }
//        error();




    }
    private static void error () {
        throw new Error();
    }
    private static void exception () throws IOException {
        throw new IOException();
    }

    private static void privateException() throws IOException {

        throw new PrivateException();

    }
}
