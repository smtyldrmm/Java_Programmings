package day32_Constrcutor;

public class CarObject {
    public static void main(String[] args) {
    Car car1=new Car("Toyota");
    Car car2=new Car("Honda","Accord");
    Car car3=new Car("For","Mustang",2020);
    Car car4=new Car("Lexus","RX350",2022,5200);
    Car car5=new Car("BMW","520D",2023,48000,"Blue");

    System.out.println(car1);
    System.out.println(car2);
    System.out.println(car3);
    System.out.println(car4);
    System.out.println(car5);
}
}