package day25_CustomMethodOverloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5,6};
        numbers=addElements(numbers,7);
        System.out.println(Arrays.toString(numbers));
        char [] chars={'A','B','C','D','E'};

        chars=addElements(chars,'F');
        System.out.println(Arrays.toString(chars));
        String [] names={"Samet","Sevinc","Kayra","Uras"};
        names= addElements(names,"Yildirim");
        System.out.println(Arrays.toString(names));

    }public static int[] addElements(int[] array, int element) {
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
