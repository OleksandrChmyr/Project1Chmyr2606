package Hometask7;

import java.util.Objects;

public class VarExample {
//    1. Создайте новый класс, у которого должно быть 9 переменных (8 примитивов разного типа + String);
    private byte b = 11;
    private short s = 2;
    private int i = 356;
    private long l = 53121;
    private float f = 22.41F;
    private double d = 11.23;
    private char c = 'K';
    private boolean bl = true;
    private String str = "Apple Pen + Pineapple Pen = Pen Pineapple Apple Pen";

// Для каждой переменной напишите getter и setter;
    public byte getB() { // Alt + ins => Getter and Setter => select all parameters
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public short getS() {
        return s;
    }

    public void setS(short s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public boolean isBl() {
        return bl;
    }

    public void setBl(boolean bl) {
        this.bl = bl;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
//    Напишите конструкторы начиная от конструктора по-умолчанию до конструктора с 9 параметрами;

    public VarExample () { // Alt+ ins  => constructor => select none

    }

    public VarExample(byte b) { // Alt+ins => constructor => select first parameter
        this.b = b;
    }

    public VarExample(byte b, short s) { // Alt+ins => constructor => select two parameters
        this.b = b;
        this.s = s;
    }

    public VarExample(byte b, short s, int i) { // Alt+ins => constructor => select three parameters .. and so on
        this.b = b;
        this.s = s;
        this.i = i;
    }

    public VarExample(byte b, short s, int i, long l) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
    }

    public VarExample(byte b, short s, int i, long l, float f) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
    }

    public VarExample(byte b, short s, int i, long l, float f, double d) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    public VarExample(byte b, short s, int i, long l, float f, double d, char c) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
        this.c = c;
    }

    public VarExample(byte b, short s, int i, long l, float f, double d, char c, boolean bl) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
        this.c = c;
        this.bl = bl;
    }

    public VarExample(byte b, short s, int i, long l, float f, double d, char c, boolean bl, String str) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
        this.c = c;
        this.bl = bl;
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VarExample that = (VarExample) o;
        return b == that.b &&
                s == that.s &&
                i == that.i &&
                l == that.l &&
                Float.compare(that.f, f) == 0 &&
                Double.compare(that.d, d) == 0 &&
                c == that.c &&
                bl == that.bl &&
                str.equals(that.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(b, s, i, l, f, d, c, bl, str);
    }

    @Override
    public String toString() {
        return "VarExample{" +
                "b=" + b +
                ", s=" + s +
                ", i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                ", c=" + c +
                ", bl=" + bl +
                ", str='" + str + '\'' +
                '}';
    }
}
