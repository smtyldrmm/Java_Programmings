package day33_Statics;

import java.util.Arrays;

public class StudentObject {  public static void main(String[] args) {
    Student student1=new Student("Samet");

    Student student2=new Student("Sevinc",'F');

    Student student3=new Student("Kayra",11);

    Student student4=new Student("Uras",16,'A');

    Student student5=new Student("Ahmet",'M',34);

    Student student6=new Student("Yildirim",'M',18 ,42 );

    Student student7=new Student("Emre",'M',48,16,'B');

    System.out.println(student1);

    Student [] students={student1,student2,student3,student4,student5,student6,student7};

    System.out.println(Arrays.toString(students));

}
}


