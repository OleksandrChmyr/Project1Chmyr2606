package Hometask10;

import Hometask9.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Выполните все пункты как одно решение задачи:
//1. Создайте 3 класса, в каждом из которых будет по одному методу с разным названием
// (Реализация этих методов на Ваше усмотрение, любая);

// --- создано 3 класса: Planes, Cars, Ships ---

//2. В Main cоздайте Список(List);
        ArrayList arrayList = new ArrayList(1000);
//        тут печатаем пустой список:
        System.out.println("печатаем пустой список:" + Arrays.toString(arrayList.toArray()));


        arrayListTest(arrayList,6,3,3);
//

    }
//3. Создайте метод, который будет принимать и возвращать Список, и проводить с ним следующие итерации:
        public static void arrayListTest (ArrayList list,int addElementsNumber1,int addElementsNumber2,int changeElementsNumber3) {

            Planes planes = new Planes("Fighter","MiG","29",
                    2,1983,2450);
            Cars cars = new Cars("Toyota","Sedan",240);
            Ships ships = new Ships("Titanic","Olympic-class ocean liner",52310,3547);
            System.out.println("Проверка класса Planes: " + planes);
            System.out.println("Проверка класса Cars: " + cars);
            System.out.println("Проверка класса Ships: " + ships);
            //а). Если список пустой(предпроверка списка должна быть),
            // добавьте в него 6 объектов 1го Вашего класса(любого из 3х описанных ранее);

            if (list.isEmpty()) {
                for (int i = 0; i < addElementsNumber1; i++) {
                    list.add(i, planes);
                }

                System.out.println("\n печатаем список после задания 3 а) - добавление объектов " + Arrays.toString(list.toArray()));
            }
            //б). После добавьте в начало списка 3 объекта 2го Вашего класса;
            for (int i = 0; i < addElementsNumber2; i++) {
                list.add(i, cars);
            }

                System.out.println("\n печатаем список после задания 3 б) - добавление в начало списка 3 объекта 2го  класса " + Arrays.toString(list.toArray()));

            //в). После замените последние 3 элемента списка на 3 объекта 3го Вашего класса;
            for (int i = list.size() - changeElementsNumber3; i < list.size(); i++) {
                list.set(i, ships);
            }
            System.out.println("\n печатаем список после задания 3 в) - замена последних 3 элементов списка на 3 объекта 3го класса " + Arrays.toString(list.toArray()));



                }






//
//4. Создайте второй метод, который на вход будет принимать Список и возвращать список и будет выполнять следующую логику:
//Проверять количество экземпляров класса в принятом Списке и оставлять только по 2 экземпляра каждого из 3 Ваших классов(то есть, 6 объектов в сумме останется после работы этого метода).
//
//5. Создать третий метод, который также будет принимать Список и будет в зависимости от экземпляра класса вызывать Ваши методы.
//После вызова всех методов всех классов очистите Список.


}
