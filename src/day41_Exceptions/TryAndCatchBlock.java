package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryAndCatchBlock {
    public static void main(String[] args) {

        System.out.println("Test Started");

        try {
            System.out.println(9/0);
            System.out.println("Try Block");
        }catch (ArithmeticException e){
            System.out.println("Catch Block");
            System.out.println("Aritmetic Exception is was occured");
        }


        System.out.println("Test Completed");
        System.out.println("------------------");

        System.out.println("Test2 started");


        int [] numbers={1,2,3,4,5};

        try {
            System.out.println(numbers[200]);
        }catch (RuntimeException    e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("Test2 Completed");

        System.out.println("-------------------------");

        System.out.println("Test3 Started");
        try {
            System.out.println("Cydeo".substring(2, 0));
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("--------------------------");
        try {
            FileInputStream fileInputStream=new FileInputStream("File path");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}
