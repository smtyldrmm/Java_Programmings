package day19_LoopPractice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0);//

        if(  !(operator == '+' || operator == '-') ){
            // If the operator is not valid, it shows error statement
            System.err.println("Invalid Math Operator: "+operator);
            // when it is not valid, it terminates whole program
            System.exit(0);
        }

        System.out.println("Enter a number:");
        int num2 = scan.nextInt();


        if (operator == '-'){
            System.out.println(num1 - num2);
        }else{
            System.out.println(num1 + num2);
        }



    }
}
