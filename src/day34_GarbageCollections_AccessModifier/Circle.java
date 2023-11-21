package day34_GarbageCollections_AccessModifier;

public class Circle   {
    public double radius;

    public static double pi;
    public static String name;

    public Circle(double radius){
        this.radius=radius;
        pi=3.14;

    }
    static {
        pi=3.14;
        name="Circle";
    }

}