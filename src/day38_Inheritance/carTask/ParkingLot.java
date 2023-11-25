package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota1=new Toyota("Camry",2020,20000,"White",1500);

        Tesla tesla1=new Tesla("Model S",2022,25000,"Black",1400);

        BMW bmw1=new BMW("X5",2021,30000,"Gray",2000);

        toyota1.start();
        bmw1.start();
        tesla1.start();
    }
}
