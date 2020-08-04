package Hometask11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static Hometask11.Questionnaire.mathTest;

public class Main {
    public static void main(String[] args) {
//Задача 1:
//Создайте программу-опросник(Можно вынести в отдельный класс с необходимым(и) методом(ами)).
//Данная программа должна просить ввести пользователя свое имя, после чего проводить опрос(достаточно 2-3 вопроса).
//Введенные данные сохраняются в виде ключ-значение, где ключ - это имя пользователя, а значение это данные в виде тоже ключ-значение(где ключ - это вопрос, а значение - ответ).
//Тип значения ответа на вопрос указать на свое усмотрение.
        mathTest();

//   Задача 2:
//1. Создайте 3 класса, которые линейно наследуются друг от друга.

//         -- Созданы классы --> Aircraft>>Plane>>FighterPlane --

// Должна быть возможность создать экземпляр класса каждого из наследников(подумайте какой тип класса должен быть).

//        -- Cоздан тип "обычный класс" (не abstract или interface). --

//2. В каждом из классов должно быть 3 поля(на свое усмотрение),
// которые имеют тип переменной List, Set или Map, то есть будут по 1 переменной с типом List, Set и Map.
// (Зная принципы ООП будьте внимательны реализуя переменные в классах!
// Чтобы не получилось что у Вашего 3го класса будет не 3, а 9 переменных).

//         -- Все классы наследуют переменные первого класса Aircraft --


//3. Далее зная про Wildcards реализуйте метод, который на вход будет принимать 2 параметра
// (List/Set/Map(На Ваше усмотрение, не принципиально)), один из которых будет разрешать передать всех наследников
// от среднего класса(Вашей цепочки наследования), второй - будет разрешать передать всех кто выше в наследовании от
// среднего класса(Вашей цепочки).


        Aircraft aircraft = new Aircraft();
        Plane plane = new Plane();
        FighterPlane fighterPlane = new FighterPlane();



        ArrayList<Aircraft> aircraft1 = new ArrayList<>();
        ArrayList<Plane> plane1 = new ArrayList<>();
        ArrayList<FighterPlane> fighterPlane1 = new ArrayList<>();

        HashSet<Aircraft> aircraft2 = new HashSet<>();
        HashSet<Plane> plane2 = new HashSet<>();
        HashSet<FighterPlane> fighterPlane2 = new HashSet<>();

        wildcardsAssignment(plane1,plane2);
        wildcardsAssignment(fighterPlane1,aircraft2);

//        wildcardsAssignment(aircraft1,fighterPlane2);     - передать нельзя так как в первый параметр можно передать
//        только Plane и наследуемые от него классы, а во второй параметр можно передать только все классы,
//        от которых наследуется Plane


    }

    public static void wildcardsAssignment (ArrayList<? extends Plane> planesWildcard1, HashSet<? super Plane> planesWildcard2) {
        System.out.println(planesWildcard1);
        System.out.println(planesWildcard2);
    }


}
