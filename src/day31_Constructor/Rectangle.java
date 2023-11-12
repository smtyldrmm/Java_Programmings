package day31_Constructor;

public class Rectangle { public double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea(){
        return length*width;
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }


    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }
}
/*
create  a custom class named Rectangle
    Attributes :
        length, width ,

       Add a constructor that can set all the fields
       Actions :

       calculateArea() ,
       calculatePerimeter (),
 */


