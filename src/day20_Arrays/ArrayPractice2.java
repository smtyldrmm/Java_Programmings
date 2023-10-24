package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        char [] letters= new char[26];

        for (char i ='A',j=0; i <='Z' && j<letters.length ; i++, j++) { // j index numbers 0 to last index
            letters[j]=i;


        }

        System.out.println(Arrays.toString(letters));


        for (int i = 0, j='A'; i < letters.length; i++, j++) {
            letters[i]=(char)j;
   /*  We use two variable in the loop  and we assign values as int and char. Initialization is the
   important part of the loop. As we assign 26 variable to array, each of the char represent one number until
   loop is over.
    */

        }
        System.out.println(Arrays.toString(letters));
        System.out.println();

        char ch='A';
        for (int i = 0; i < letters.length; i++) {
            letters[i]=ch++;


        }
        System.out.println(Arrays.toString(letters));
        char each='Z';
        for (int k = letters.length-1; k >=0 ; k--) {
            letters[k]=each++;


        }
        System.out.println(Arrays.toString(letters));
    }
}
