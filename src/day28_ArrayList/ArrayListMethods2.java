package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        // There are two options for remove method
        Integer num=200;
        boolean e=list.remove(num); // it removes the object
        System.out.println(list);
        list.remove(2); // it removes the index of the array list
        System.out.println(e);
        System.out.println(list);

        // clear method remove all of them
        list.clear(); // it removes all of the element of array list
        System.out.println(list);

        ArrayList<Character>characters=new ArrayList<>();
        characters.add('a');
        characters.add('b');
        characters.add('c');
        characters.add('d');
        characters.add('e');
        characters.add('f');
        characters.add('a');
        int a= characters.indexOf('a'); // it gives first element of array list as a int.
        int b=characters.lastIndexOf('a'); // it gives last element of array list as a int.
        System.out.println(a);
        System.out.println(b);

        boolean r2=characters.contains('a'); // Aranan karakterin arraylist içinde olup olmadığını kontrol eder.
        boolean r3=characters.contains('z');
        System.out.println(r2);
        System.out.println(r3);
        System.out.println("----------------------------------------------");
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);
        System.out.println(list1==list2);// false değeri verecek çünkü ArrayList içerisinde ki
        // new ArrayList farklı iki object oluşturur ve bunların değerini farklı olarak görür.
        // o yüzden == ile değil equals methodu ile değerlerin eşitliği sorgulanır.
        System.out.println(list1.equals(list2)); // it gives true
        System.out.println("-----------------------------------");
        boolean r4= list1.isEmpty();
        System.out.println("r4 = " + r4);
        System.out.println("--------------------------");

        ArrayList<Integer> numbers=new ArrayList<>();
        // This name is Bulk operation
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(numbers);

    }
}
