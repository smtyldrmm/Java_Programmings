package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {


        int [] numbers={10,20,30,40,50,60};
        int [] reversed= new int[numbers.length]; // to make sure that Array has enough capacity to contain all elements
        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) { // for is shortcut of reverse loop
            reversed[j]=numbers[i];


        }
        System.out.println(Arrays.toString(reversed));
    }
}
