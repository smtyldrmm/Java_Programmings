package day30_CustomClass;

public class Car {
    public String brand;
    public String color;
    public String model;
    public int year;
    public double price;


    public void setInfo(String carBrand, String carColor, String carModel, int carYear, double carPrice ) {
        brand = carBrand;
        color = carColor;
        model = carModel;
        year = carYear;
        price = carPrice;


    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public void  drive(){
        System.out.println("Driving"+ brand+" "+model);
    }
    public void start(){
        System.out.println(brand+" "+model+" has started");
    }
    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }

}


