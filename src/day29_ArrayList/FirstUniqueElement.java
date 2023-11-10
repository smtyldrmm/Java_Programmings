package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {
        /*Write a program that can return first unique elements from an array list
        do not use indexOf and lastIndexOf
         */

    ArrayList<Integer> list=new ArrayList<>();
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(5);
    System.out.println(list);

    for (Integer each : list) {
        int frequency = 0;
        for (Integer element : list) {
            if (element == each) {
                frequency++;
            }
        }
        if(frequency==1){
            System.out.println(each);
            break;
        }
    }
}
}


