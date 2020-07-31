package Hometask10_2;

import java.util.Objects;

public class Lake {
//    private int length;
//    private int width;
//
//    public Lake() {
//    }
//
////    public Lake(int length, int width) {
////        this.length = length;
////        this.width = width;
////    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Lake lake = (Lake) o;
//        return length == lake.length &&
//                width == lake.width;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(length, width);
//    }
//
//    @Override
//    public String toString() {
//        return "Lake{" +
//                "length=" + length +
//                ", width=" + width +
//                '}';
//    }

    @Override
    public String toString() {
        return "Lake{}";
    }

    public static void lakeFlow () {
        System.out.println("Water in the lake does not flow");
    }
}
