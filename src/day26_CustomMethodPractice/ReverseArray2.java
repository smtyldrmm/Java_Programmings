package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8};
        int [] result=reverse(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int [] reverse(int [] array){
        int [] result={};
        for (int i = array.length - 1; i >= 0; i--) {
            result=  ArraysUtility.addElement(result,array[i]);

        }
        return result;
    }
}
