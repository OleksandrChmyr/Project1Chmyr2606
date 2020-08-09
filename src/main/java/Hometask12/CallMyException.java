package Hometask12;

import java.io.IOException;

public class CallMyException {

    public static void callMyFirstException () throws ArithmeticException {
     MyExceptionMethods.firstException();
 }

    public static void callMySecondException () throws Exception {
     MyExceptionMethods.secondException();
 }

    public static void callMyThirdException () throws IOException {
     MyExceptionMethods.thirdException();
 }


}
