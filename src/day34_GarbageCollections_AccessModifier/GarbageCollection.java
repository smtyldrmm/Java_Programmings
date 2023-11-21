package day34_GarbageCollections_AccessModifier;

import day30_CustomClass.Dog;

import java.util.ArrayList;

public class GarbageCollection {
    public static void main(String[] args)  {

    String str="Wooden Spoon";
    //  null değeri atayarak değerin garbage collectiona taşınmasını sağlarız.
    // garbage collectiona göndermenin iki yolundan biri bu.
    str=null;
    // ikinci yolu aşağıdaki şekilde

    Dog dog1=new Dog();
    dog1.name="Lucy";

    dog1=new Dog();

    dog1.name="Max";
    //Bu şekilde Lucy garbage collectiona gider.Teşekkürler Lucy Teşekkürler

    ArrayList<String> l1 = new ArrayList<>();
    l1.add("Java");

    ArrayList<String> l2 = l1;
    l2.add("Python");


    System.out.println("l1 = " + l1);
    System.out.println("l2 = " + l2);

}
}
