package day27_WrapperClass;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int num1=200;
        Integer n1=num1; // autoboxing
        int num2=n1;    //  unboxing

        Integer integerValue=200;
        // Object üzerinden primitive tipe çevirirken herhangi bir değer verebiliriz.
        long longValue=integerValue;

        // primitive tipten objecte çevrileceği zaman sadece kendi sınıfından değere atanır.
        // int => Integer --  byte==> Byte --  double==> Double




    }
}
