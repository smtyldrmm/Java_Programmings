package day41_Exceptions;

public class Checked_Vs_Unchecked {
    public static void main(String[] args) {

        // Unchecked exceptions

        int a=10;
        int b=0;
        //System.out.println(a/b); // if you can't handle this problem, so you couldn't get the result "Wooden Spoon"
        System.out.println("Wooden Spoon");


        char [] characters={'A','B','C'};
        //System.out.println(characters[18]); // it gives ArrayIndexOutOfBoundsException

        // checked exception
        System.out.println("Hello");

        //Thread.sleep(30000);

        System.out.println("Cydeo");

    }
}
