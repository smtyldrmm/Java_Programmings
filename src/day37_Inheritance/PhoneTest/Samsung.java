package day37_Inheritance.PhoneTest;

public class Samsung extends Phone{

    public Samsung(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }
    public void freeze(){
        System.out.println(brand+" "+ model+" "+ " is freezing");
    }
}
