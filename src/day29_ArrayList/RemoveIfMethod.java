package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);
        list.removeIf( p -> p<5);
        /* removeIf herhangi bir şartta değerlerin remove edilmesi için  kullanılır.
    (p -> p<5) ifadesinde ki p değişkeni -> ifadesi lambda expression ifade eder.
    ilerleyen konularda anlatılacak ama bazı fonksiyonları daha kısa yolla kullanmaya yarıyor.Önemli*/
        System.out.println(list);

        System.out.println("------------------------------");

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list2);
        list2.removeIf(each -> each%2==0);
        System.out.println(list2);
        System.out.println("----------------------------");

        ArrayList< String> list3= new ArrayList<>();
        list3.addAll(Arrays.asList("Java","Python","JavaScript","C#","C++","Java","Java"));
        list3.removeIf(p -> p.startsWith("J"));
        System.out.println(list3);
        System.out.println("-----------------------");

        ArrayList<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Racecar","Level","Eye","Java","Python","Cydeo"));
        names.removeIf(name -> !StringUtility.isPalindrome(name));
        // removeIf kullandığımız için palindrome olmayanları kaldırır ve palindrome olanlar kalır.
        System.out.println(names);

        // remove ==> when we remove one element. DO NOT use it in the  loop
        // removeAll() ==> when we remove multiple elements (if the elements that we want to remove are known)
        // retainAll() ==> when we want to retain multiple elemens (if the elements that we want to remove are known)
        // removeIf()  ==> when we remove under a condition (if the elements we want to remove are known)
    }
}
