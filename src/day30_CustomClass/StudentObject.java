package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.setInfo("Samet",'M',33,510,'B');
        System.out.println(student1);

        Student student2=new Student();
        student2.setInfo("Elimnur",'F',26,870,'A');

        Student student3=new Student();
        student3.setInfo("Kayra",'M',3,1,'A');

        Student student4=new Student();
        student4.setInfo("Sevinc",'F',32,42,'F');

        Student [] students={student4,student3,student2,student1};
        for (Student student : students) {
            System.out.println(student);

        }

        System.out.println("-------------------------------");
        ArrayList<Student> earlyBirds=new ArrayList<>(); // grade A
        ArrayList<Student> angryBirds=new ArrayList<>(); // grade rest of them
        for (Student student : students) {
            if(student.grade=='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }
        System.out.println(earlyBirds);
        System.out.println(angryBirds);
    }
}


