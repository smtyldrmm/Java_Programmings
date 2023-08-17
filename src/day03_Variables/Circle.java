package day03_Variables;

public class Circle {
    public static void main(String[] args) {

        //PI, radius, diameter, area, perimeter
        double radius=5.5;

        double PI=3.14;

        double diameter=radius*2; // finds the diameter by multiplying the radius to 2
        double area=radius*radius*PI; // find the area of the circle
        double perimeter=diameter*PI; // find the perimeter of the circle

        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
