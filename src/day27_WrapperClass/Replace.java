package day27_WrapperClass;

import java.util.Arrays;

public class Replace {

    // create a method named replace that passes  three parameters
    // Ex .: arr{1,2,3,4,5}
    //  replace(arr,2,30) ==> {1,2,30,4,5}
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        array= replace(array,2,30);
        System.out.println(Arrays.toString(array));

        String [] str={"Java","Pyhton","C++","Ruby"};
        str=replace(str,2,"C#");
        System.out.println(Arrays.toString(str));


    }
    // replace the elements of array at the given index with the new element
    public static int [] replace(int [] array, int index, int newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index");
            System.exit(0);
        }
        array [index] = newElement;
        return  array;
    }
    public static double [] replace(double [] array, int index, double newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index");
            System.exit(0);
        }
        array [index] = newElement;
        return  array;
    }
    public static char [] replace(char [] array, int index, char newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index");
            System.exit(0);
        }
        array [index] = newElement;
        return  array;
    }
    public static String [] replace(String [] array, int index, String newElement){
        if(index<0 || index> array.length-1){
            System.err.println("Invalid Index");
            System.exit(0);
        }
        array [index] = newElement;
        return  array;
    }
}
