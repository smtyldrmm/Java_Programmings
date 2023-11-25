package day37_Inheritance.PhoneTest;

public class Iphone extends Phone {

    public Iphone(String brand, String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }
    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+ model+" "+" is having ");
    }
    public void email(String email){
        System.out.println(brand+" "+ model+" is having a FaceTime");
    }
}
