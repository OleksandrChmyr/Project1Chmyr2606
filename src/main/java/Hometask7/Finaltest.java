package Hometask7;

public class Finaltest {
    private final String NAME;
    private final String MODEL;
    private final int HP;

//    public Finaltest() {
//    } - Конструктор по умолчанию задать нельзя:

//    Примечания для себя:
//    8.3.1.2. final Fields
//      A field can be declared final (§4.12.4).
//      Both class and instance variables (static and non-static fields) may be declared final.
//
//It is a compile-time error if a blank final (§4.12.4) class variable is not definitely assigned (§16.8)
// by a static initializer (§8.7) of the class in which it is declared.
//
//A blank final instance variable must be definitely assigned (§16.9) at the end of every constructor (§8.8)
// of the class in which it is declared; otherwise a compile-time error occurs.

//    Итого, нельзя использовать конструктор по умолчанию для final параметров, так как они должны быть обязательно
//    заданы конструктором (https://docs.oracle.com/javase/specs/jls/se7/html/jls-8.html#jls-8.3.1.2)


//A final variable can only be initialized once, either via an initializer or an assignment statement.
// It does not need to be initialized at the point of declaration: this is called a "blank final" variable.
// A blank final instance variable of a class must be definitely assigned at the end of every constructor
// of the class in which it is declared; similarly, a blank final static variable must be definitely assigned in a static initializer
// of the class in which it is declared: otherwise, a compile-time error occurs in both cases.
// (Note: If the variable is a reference, this means that the variable cannot be re-bound to reference another object.
// But the object that it references is still mutable, if it was originally mutable.)
//    https://stackoverflow.com/questions/11345061/why-must-a-final-variable-be-initialized-before-constructor-completes


    public Finaltest(String NAME, String MODEL, int HP) {
        this.NAME = NAME;
        this.MODEL = MODEL;
        this.HP = HP;
    }

    public String getNAME() {
        return NAME;
    }
//    Примечания для себя:
//     Final members (variables) can not change their values once they are initialized,
//     therefore, they must be assigned either when declared or at least in the constructor.
//     Since they can not change their initial value, there is no reason for definig a setter (not allowed)

//     setter указать невозможно так как даный параметр является final и переназначить его значение невозможно.
//     Переменная может быть объявлено как final, что позволяет предотвратить изменение содержимого переменной,
//     сделав ее, по существу, константой.
//
//    final переменная класса, объявленная как не static, должна инициализироваться при объявлении или в теле
//     конструктора или блоке инициализации, иначе произойдет ошибка компиляции.

//    Кроме переменных, объявленными как final могут быть параметры метода и локальные переменные.
//    final переменные, объявленные как static, должны быть проинициализированы при объявлении или в блоке инициализации,
//    также объявленном как static. В противном случае, опять получится ошибка компиляции.

    public String getMODEL() {
        return MODEL;
    }

    public int getHP() {
        return HP;
    }
}
