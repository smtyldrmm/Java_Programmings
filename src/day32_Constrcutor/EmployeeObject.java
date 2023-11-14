package day32_Constrcutor;

public class EmployeeObject {
    public static void main(String[] args) {


    Employee employee1=new Employee("Samet");
    System.out.println(employee1);

    Employee employee2=new Employee("Kayra",'M');
    System.out.println(employee2);

    Employee employee3=new Employee("Sevinc",'F',"SDET");
    System.out.println(employee3);

    Employee employee4=new Employee("Uras",'M',"QA",11500);
    System.out.println(employee4);

}
}


