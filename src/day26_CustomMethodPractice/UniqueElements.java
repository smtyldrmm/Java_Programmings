package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        int [] array={1,1,1,2,3,3,4,5,5,6,7,8};
        int []  unique=uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        double [] array2={1.5,2.5,1.5,3.4,8.5,3.4,5.5};
        double [] unique2=uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));

    }
    // returns the unique elements of array as a new array
    public static int[]  uniqueElements(int [] array){
        int [] result={}; // Bulacağımız benzersiz karakterleri sayacağımız int arrayi oluşturduk.
        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){// Daha önce oluşturduğumuz method içinden frequency methodunu çektik ve
                // eğer frequency ==1 ise bu element tektir.
                result=  ArraysUtility.addElement(result,each); // Daha sonra burada arraya element ekleme methodunu çağırdık.

            }
        }
        return  result;
    }
    public static double[]  uniqueElements(double [] array){
        double [] result={}; // Bulacağımız benzersiz karakterleri sayacağımız int arrayi oluşturduk.
        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){// Daha önce oluşturduğumuz method içinden frequency methodunu çektik ve
                // eğer frequency ==1 ise bu element tektir.
                result=  ArraysUtility.addElement(result,each); // Daha sonra burada arraya element ekleme methodunu çağırdık.

            }
        }
        return  result;
    }
    public static char[]  uniqueElements(char [] array){
        char [] result={}; // Bulacağımız benzersiz karakterleri sayacağımız int arrayi oluşturduk.
        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){// Daha önce oluşturduğumuz method içinden frequency methodunu çektik ve
                // eğer frequency ==1 ise bu element tektir.
                result=  ArraysUtility.addElement(result,each); // Daha sonra burada arraya element ekleme methodunu çağırdık.

            }
        }
        return result;
    }
    public static String[]  uniqueElements(String [] array){
        String [] result={}; // Bulacağımız benzersiz karakterleri sayacağımız int arrayi oluşturduk.
        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array,each)==1){// Daha önce oluşturduğumuz method içinden frequency methodunu çektik ve
                // eğer frequency ==1 ise bu element tektir.
                result=  ArraysUtility.addElement(result,each); // Daha sonra burada arraya element ekleme methodunu çağırdık.

            }
        }
        return result;
    }
}
