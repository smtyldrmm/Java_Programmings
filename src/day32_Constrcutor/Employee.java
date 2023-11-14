package day32_Constrcutor;

public class Employee { // this. : to call instance variables & instance variable
    // this(); : used for calling the constructor



    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name){
        this.name=name;
    }
    public Employee(String name,char gender){
        // Constructor  can not be  called by its name (this () needs to be used)
        // Only a constructor can call another constructor
        // Constructor MUST be at the first time
        // One constructor can not call more than one constructor
        // Constructor can not call itself
        //  this(name);  Bu şekilde yukarıdaki constructurı çağırabiliriz.
        //this.name=name; // eski kullanım şekli bu ama constructurı bu şekilde çağırabiliriz.

        this(name);
        this.gender=gender;
    }
    public Employee(String name,char gender,String jobTitle){
        this(name,gender);

        this.jobTitle=jobTitle;
    }
    public Employee(String name,char gender,String jobTitle,double salary){
        this(name,gender,jobTitle);
        this.salary=salary;
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
