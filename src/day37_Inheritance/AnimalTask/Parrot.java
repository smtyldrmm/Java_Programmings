package day37_Inheritance.AnimalTask;

public class Parrot extends Animal {

    public String parrotWingColor;
    public Parrot(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
        // this.parrotWingColor=parrotWingColor;
    }
    public void sing(){
        System.out.println(name+" is singing");
    }
}

