package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {


        public static void main(String[] args) {

            ArrayList<String> employees=new ArrayList<>();
            employees.addAll(Arrays.asList("Samet","Kayra","Uras","Sevinc","Darius","Branyt","Ahmed","David","Shay"));

            employees.retainAll(Arrays.asList("Kayra","Uras"));
            System.out.println(employees);
            System.out.println("---------------------------------");
            // Baş harfi M ile başlayanları sileceğiz.
            String [] names={"Mary","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"};
            // Öncelikle Arrayi ArrayList e çeviriyoruz.
            ArrayList<String> list=new ArrayList<>(Arrays.asList(names));
            list.removeIf(p -> p.charAt(0)=='M');
            System.out.println(list);

            names=list.toArray(new String [0]);
            System.out.println(Arrays.toString(names));



        }
    }


