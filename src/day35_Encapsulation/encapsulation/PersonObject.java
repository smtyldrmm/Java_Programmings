package day35_Encapsulation.encapsulation;

public class PersonObject { public static void main(String[] args) {

    Person person1=new Person();

    person1.setName("Samet");
    person1.setAge(25);

    System.out.println(person1.getName()+":"+person1.getAge());

}
}
