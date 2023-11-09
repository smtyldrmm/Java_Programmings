package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int [] numbers={100,200,300,400,500,600};
        numbers= removeElement(numbers,2);
        System.out.println(Arrays.toString(numbers));
    }
    public static int [] removeElement(int [] array,int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index Number");
            System.exit(0);
        }
        int[] result = new int[array.length - 1];
        int j = 0; // index numbers of this array
        for (int i=0;i< array.length;i++) {
            if (i == index) {
     // Burası ile for each ile aldığımız her elementi array[index] ile
     // yazacağımız element sırası ile karşılaştıracağız. Ve eşit olanı atlayacak.
                continue;
            }
            result[j++] =array[i] ;
     // j değeri arrayin kaç elementten oluşacağını düzenlemek için verildi. Yani döngü her döndüğünde birer
     // arttıracak ve indexin eşit olduğu değeri atlayarak new arrayin kaç elementten oluştuğunu yazacak.
        }
        return result;
    }
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }




}


