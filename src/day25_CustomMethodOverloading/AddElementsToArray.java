package day25_CustomMethodOverloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        arr = addElements(arr, 5);
        System.out.println(Arrays.toString(arr));
        double[] arr1 = {1.5, 2.5, 3.5, 4.5};
        arr1 = addElements(arr1, 5.5);
        System.out.println(Arrays.toString(arr1));
        char[] arr2 = {'a', 'b', 'c', 'd'};
        arr2 = addElements(arr2, 'e');
        System.out.println(Arrays.toString(arr2));
        String [] arr3={"Samet","Sevinc","Kayra"};
        arr3=addElements(arr3,"Uras");
        System.out.println(Arrays.toString(arr3));


    }

    // we will add an element to array .
    public static int[] addElements(int[] array, int element) {
        int[] result = new int[array.length + 1]; // to add new element I have to set the size of element
        int i = 0; // to get the how many times to turn I assign a variable as a int i
        for (int each : array) { // to get each element I use for each loop
            result[i++] = each; // each will get how many times for each loop turn as a array length
            // i represent index of new  array

        }
        result[i] = element;// Bu değerden nasıl 5 aldığı sorulacak.
        return result;
    }

    public static double[] addElements(double[] array, double element) {
        double[] result = new double[array.length + 1];
        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element; // element need to be assign last index
        return result;
    }

    public static char[] addElements(char[] array, char element) {
        char[] result = new char[array.length + 1];
        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element; // element need to be assign last index
        return result;
    }

    public static String[] addElements(String[] array, String element) {
        String[] result = new String[array.length + 1];
        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element; // element need to be assign last index
        return result;
    }
}
