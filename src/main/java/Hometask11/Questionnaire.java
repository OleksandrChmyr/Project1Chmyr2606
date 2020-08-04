package Hometask11;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Questionnaire {

//    Задача 1:
//Создайте программу-опросник(Можно вынести в отдельный класс с необходимым(и) методом(ами)).
//Данная программа должна просить ввести пользователя свое имя, после чего проводить опрос(достаточно 2-3 вопроса).
//Введенные данные сохраняются в виде ключ-значение, где ключ - это имя пользователя, а значение это данные в виде
// тоже ключ-значение(где ключ - это вопрос, а значение - ответ).
//Тип значения ответа на вопрос указать на свое усмотрение.

    public static HashMap mathTest () {
        Scanner scanner = new Scanner(System.in);


        String questionName = ("Please enter your name to begin test: ");
        String question1 = ("\nWhat is the Sum of 2 and 3: ");
        String question2 = ("\nWhat is the Sum of 6 and 4: ");
        String question3 = ("\nWhat is the Difference of 10 and 7: ");

        System.out.println(questionName);
        String name = scanner.next();

        System.out.println(question1);
        int ex1 = scanner.nextInt();

        System.out.println(question2);
        int ex2 = scanner.nextInt();

        System.out.println(question3);
        int ex3 = scanner.nextInt();

        HashMap<String,Integer> answers = new HashMap<>();
        answers.put(question1,ex1);
        answers.put(question2,ex2);
        answers.put(question3,ex3);


        HashMap<String, HashMap<String, Integer>> testAnswersHashMap = new HashMap<>();
        testAnswersHashMap.put(name,answers);

        System.out.println("Thank you," + name + "! Your answers are as follows, please check: \n" + testAnswersHashMap);

        return testAnswersHashMap;

    }
}
