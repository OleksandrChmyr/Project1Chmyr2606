package Hometask12;

import java.io.IOException;

public class MyExceptionMethods {
//    1. Создайте класс, в которому будут 3 отдельных метода, логика которых будет вызывать 3 разные “проверяемые”
//    (checked) ошибки. Ошибки можете вызвать принудительно в ходе какой-то логики(не принципиально);

    public static void firstException() throws ArithmeticException{
        throw new ArithmeticException("The equation can not be solved due to an arithmetic error");

    }
    public static void secondException() throws Exception{
        throw new Exception("Your answer is too small");

    }
    public static void thirdException() throws IOException{
        throw new IOException("Your answer is too big");


    }
}
