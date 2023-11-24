package day35_Encapsulation.encapsulation;

public class EmployeeObject { public static void main(String[] args) {

    Employee employee1=new Employee("Samet",'M',33,12000);

    System.out.println(employee1);

    employee1.setAge(32);
    System.out.println(employee1);

    Employee employee2=new Employee("Kayra",'M',3,10000);
    System.out.println(employee2);
    employee2.setSalary(employee2.getSalary()+15000);
    System.out.println(employee2);

}
}