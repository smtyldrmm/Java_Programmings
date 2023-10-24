package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("How many number do you like to enter");
            int length=scan.nextInt(); // length will be represented how long array will be

            if(length<=0){ // This part we check if numbers are zero or negative.
                System.err.println("Invalid Entry");
                System.exit(0); // when if part is true, we want to exit system.
            }
            int [] number=new int[length]; // the number which I write with scanner is will be my array length

            for (int i = 0; i < length; i++) {
                System.out.println("Enter a number");
                number[i]= scan.nextInt(); // It enables to write numbers with scanner

            }
            System.out.println(Arrays.toString(number)); // so it is Array, I can use print action with Arrays.toString
            scan.close(); // I close the scanner


        }
}


