package day37_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {

    Dog dog1=new Dog("Lessie","Golden",'F',"Large",4,"Orange");
    System.out.println(dog1);
    dog1.bark();

    Cat cat1=new Cat("Love","Siamese",'M',"Small",2,"Brown");
    System.out.println(cat1);
    cat1.scratch();

    Parrot parrot1=new Parrot("King","Macaw",'F',"Small",1,"Green");
    System.out.println(parrot1);
    parrot1.sing();

}
}
