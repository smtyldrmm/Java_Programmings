package day20_Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        // Create a variable that include 5 names
        String[] myGroup = new String[5]; // 0 ~ 4
        myGroup[0] = "Samet";
        myGroup[1] = "Kayra";
        myGroup[2] = "Sevinc";
        myGroup[3] = "Uras";
        myGroup[4] = "Salih";

        //   myGroup[5] = "Muhtar"; There is no such a myGroup[5], because this array length is 4
        //   myGroup[-1] = "Adam";

        // We can't write directly with println and there is toStirng method that comes with Arrays
        // System.out.println(myGroup); //hashcode
        System.out.println(Arrays.toString(myGroup)); //["Samet", "Kayra", "Sevinc", "Uras", "Salih"]

        System.out.println("-----------------------------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index:            0          1           2           3          4          5           6

        //   days[7] = "JavaDay";

        System.out.println( Arrays.toString(days) );

        int number = 1;

        if(number <1 || number > 7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println( days[number-1] );


    }
}
