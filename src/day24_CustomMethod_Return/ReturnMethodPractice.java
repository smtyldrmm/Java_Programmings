package day24_CustomMethod_Return;

public class ReturnMethodPractice {
    // find max number between 100 & 200
    // multiply the max number by 2
    public static void main(String[] args) {
        int maxNumber=max(100,200);
        System.out.println(maxNumber);

        int multiply=2*maxNumber;
        System.out.println("multiply = " + multiply);

    }

    public static int max(int a, int b){
        int result=0;
        if(a>b){
            result=a;
        }else {
            result=b;
        }
        return result;
    }



}


