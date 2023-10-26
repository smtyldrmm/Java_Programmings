package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] numbers = {7, 5, 4, 20, 8, 22};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > max ){
    // it checks if element in the array greater than the current max number
                max = numbers[i];
   // it assigns numbers[i] as a maximum number
            }

        }

        System.out.println(max);

    }
}
