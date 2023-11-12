package day30_CustomClass;

public class DogObject {

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Lucy";
        dog1.age=2;
        dog1.breed="Husky";
        dog1.gender='F';
        dog1.size="Small";
        dog1.color="White";



        Dog dog2=new Dog();
        dog2.name="Ace";
        dog2.breed="Husky";
        dog2.age=5;
        dog2.gender='M';
        dog2.size="Large";
        dog2.color="White & Black";

        Dog dog3=new Dog();
        dog3.setInfo("Jack","German Shpeard",2,'M',"Small","Brown");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        dog3.play();

    }
}

