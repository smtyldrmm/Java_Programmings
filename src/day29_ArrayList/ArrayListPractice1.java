package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class    ArrayListPractice1 {
    public static void main(String[] args) {

    String [] countries = {"Japan","Korea","United States","Turkey","United Kingdom","Canada"};
    //converting array  to ArrayList
    ArrayList<String> list= new ArrayList<>(Arrays.asList(countries));
    list.removeIf(p-> p.length() >=10);
    //converting ArrayList to Array
   // 0 yerine başka herhangi bir rakamda girebilirsin.Rakamın önemi yok.
    countries= list.toArray(new String[2]);

    System.out.println(Arrays.toString(countries));




        /*Create an Array of string called countries
        write a program that can remove all country names that have length of 10 or greater
         */
}
}


