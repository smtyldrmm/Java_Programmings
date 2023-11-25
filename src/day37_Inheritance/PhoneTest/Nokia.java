package day37_Inheritance.PhoneTest;

public class Nokia extends Phone{
    public Nokia(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }
    public void selfDefense(){
        System.out.println("you can use "+ brand+" "+ model+"as self defense tool");
    }

}
