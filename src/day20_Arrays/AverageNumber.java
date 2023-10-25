package day20_Arrays;

public class AverageNumber {
    public static void main(String[] args) {

        int [] numbers= {10,20,30,40,50,60,70};
        double sum=0;
// So I want to get average number and there is possible to get reminder, I use double

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average=sum/numbers.length;
        System.out.println(average);

    }
}
