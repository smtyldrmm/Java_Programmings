package day27_WrapperClass;

import utilities.ArraysUtility;

import java.util.Arrays;

import static utilities.ArraysUtility.contains;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] array={1,1,2,2,2,3,4,5,5,6,7,8};
        array=removeDuplicates(array);
        System.out.println(Arrays.toString(array));
        String [] arr={"Java","Python","Java","Python","C#","C#"};
        arr=removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }
    //removes the duplicates from the given array, returns new array
    public static int [] removeDuplicates(int [] array){
        int [] result={}; // Temprorary Value
        for (int each : array) {
            if(!contains(result,each)){
                result=  ArraysUtility.addElement(result,each);
            }

        }
        return  result;
    }
    public static double [] removeDuplicates(double [] array){
        double [] result={}; // Temprorary Value
        for (double each : array) {
            if(!contains(result,each)){
                result=  ArraysUtility.addElement(result,each);
            }

        }
        return  result;
    }
    public static char [] removeDuplicates(char [] array){
        char [] result={}; // Temprorary Value
        for (char each : array) {
            if(!contains(result,each)){
                result=  ArraysUtility.addElement(result,each);
            }

        }
        return  result;
    }
    public static String [] removeDuplicates(String [] array){
        String [] result={}; // Temprorary Value
        for (String each : array) {
            if(!ArraysUtility.contains(result,each)){
                result=  ArraysUtility.addElement(result,each);
            }

        }
        return  result;
    }
}
