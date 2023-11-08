package day25_CustomMethodOverloading;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        double [] arr2={1.5,2.5,3.5,4.5};
        ArraysUtility.printEachElement(arr2);
        char [] ch3={'a','b','c','d'};
        ArraysUtility.printEachElement(ch3);
        String [] str={"Samet","Sevinc","Kayra"};
        ArraysUtility.printEachElement(str);
        System.out.println("------------------");
        int [] n1={6,5,1,7,2,3};
        int max1=ArraysUtility.max(n1);
        System.out.println(max1);
        double [] n2={1.6,.9,2.6,7.2,8.5,2.4};
        double max2=ArraysUtility.max(n2);
        System.out.println(max2);
        int min1=ArraysUtility.min(n1);
        System.out.println(min1);

        int []  a1={1,2,3,4,5,6,7};
        boolean r1=ArraysUtility.contains(a1,6);
        System.out.println(r1);
    }

}
