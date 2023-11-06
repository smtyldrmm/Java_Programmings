package day23_CustomMethod_Void;

public class CustomMethodWithParameters {
    public static void main(String[] args) {

        oddOrEven(9);
        ageOfPerson(1989);
        // Alt kısımda method içerisine yazdığım int birthYear ile main ekranına birthYear değerini yazınca
        // formülü ve sout ekranını çalıştırarak bana sonucu veriyor.
        printNumbers(1000,1050);
    }

    // create function that can check if a number is odd number or even number
    public static void oddOrEven(int number) {

        if (number % 2 == 0) {
            System.out.println("Number is even number");
        } else {
            System.out.println("Number is odd number");
        }


    }

    public static void ageOfPerson(int birthYear) {
        int age = 2023 - birthYear;
        System.out.println(age);

    }

    public static void printNumbers(int x, int y) {

        for (int i = x; i <= y; i++) {
            System.out.print(i+" ");
        }


    }
}

