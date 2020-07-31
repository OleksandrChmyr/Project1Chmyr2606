package Hometask10_2;

import Hometask10.Cars;
import Hometask10.Planes;
import Hometask10.Ships;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Выполните все пункты как одно решение задачи:
//1. Создайте 3 класса, в каждом из которых будет по одному методу с разным названием
// (Реализация этих методов на Ваше усмотрение, любая);

// --- создано 3 класса: River, Lake, Sea ---

//2. В Main cоздайте Список(List);
        ArrayList arrayList = new ArrayList(1000);
//        тут печатаем пустой список:
        System.out.println("печатаем пустой список:" + Arrays.toString(arrayList.toArray()));


        arrayListTest(arrayList,6,3,3);
        System.out.println("\n Список после задания 3: " + arrayList);

        checkClassNumber(arrayList,2);
        System.out.println("\n Список после задания 4: " + arrayList);

        classMethodCall(arrayList);

    }
    //3. Создайте метод, который будет принимать и возвращать Список, и проводить с ним следующие итерации:
    public static void arrayListTest (ArrayList list,int addElementsNumber1,int addElementsNumber2,int changeElementsNumber3) {


        //а). Если список пустой(предпроверка списка должна быть),
        // добавьте в него 6 объектов 1го Вашего класса(любого из 3х описанных ранее);

        if (list.isEmpty()) {
            for (int i = 0; i < addElementsNumber1; i++) {
                list.add(i, new River());
            }

            System.out.println("\n печатаем список после задания 3 а) - добавление объектов " + Arrays.toString(list.toArray()));
        }
        //б). После добавьте в начало списка 3 объекта 2го Вашего класса;
        for (int i = 0; i < addElementsNumber2; i++) {
            list.add(i, new Lake());
        }

        System.out.println("\n печатаем список после задания 3 б) - добавление в начало списка 3 объекта 2го  класса " + Arrays.toString(list.toArray()));

        //в). После замените последние 3 элемента списка на 3 объекта 3го Вашего класса;
        for (int i = list.size() - changeElementsNumber3; i < list.size(); i++) {
            list.set(i, new Sea());
        }
        System.out.println("\n печатаем список после задания 3 в) - замена последних 3 элементов списка на 3 объекта 3го класса " + Arrays.toString(list.toArray()));

    }

//
//4. Создайте второй метод, который на вход будет принимать Список и возвращать список и будет выполнять следующую логику:
//Проверять количество экземпляров класса в принятом Списке и оставлять только по 2 экземпляра каждого из 3
// Ваших классов(то есть,6 объектов в сумме останется после работы этого метода).

    public static void checkClassNumber (ArrayList list2,int maxClassObjNum) {
//        System.out.println("\n Создайте второй метод, который на вход будет принимать Список и возвращать список");
        int lakeMin = 0;
        int riverMin = 0;
        int seaMin = 0;
        for (int i = 0; i < list2.size(); i++) {
            Object obj = list2.get(i);

            if (obj instanceof Lake) {
                lakeMin++;
                if (lakeMin > maxClassObjNum) {
                    list2.remove(list2.get(i));
                    i--;
               }

            } else if (obj instanceof River) {
                riverMin++;
                if (riverMin > maxClassObjNum) {
                    list2.remove(list2.get(i));
                    i--;
                }

            } else if (obj instanceof Sea) {
                seaMin++;
                if (seaMin > maxClassObjNum) {
                    list2.remove(list2.get(i));
                }

             }
        }
    }


//5. Создать третий метод, который также будет принимать Список и будет в зависимости от экземпляра класса вызывать Ваши методы.
//После вызова всех методов всех классов очистите Список.

    public static void classMethodCall(ArrayList list3) {
        for (int i = 0; i < list3.size(); i++) {
            Object obj = list3.get(i);

            if (obj instanceof Lake) {
                Lake.lakeFlow();
            } else if (obj instanceof River) {
                River.riverFlow();
            } else if (obj instanceof Sea) {
                Sea.seaWaves();
            }
        }
        list3.clear();
        System.out.println("\nThe list is cleared:" + list3);
    }
}


