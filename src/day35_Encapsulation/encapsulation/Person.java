package day35_Encapsulation.encapsulation;

public class Person {   private String name;
    private int age;

    public String getName(){
        return  name;
    }
    // setter kullanırken void kullanmak zorundayız
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }


}
