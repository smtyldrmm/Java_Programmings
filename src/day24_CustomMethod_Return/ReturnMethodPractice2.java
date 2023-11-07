package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
        String str=grade(95);
        if(str.equals("A")){
            System.out.println("Excellent");
        } else if (str.equals("B")) {
            System.out.println("Great");
        } else if (str.equals("C")) {
            System.out.println("Good");
        } else if (str.equals("D")) {
            System.out.println("Passed");
        }else {
            System.out.println("Try Again");
        }
    }
    public static String grade(int score){
        String result="";
        if(score<0 && score>100){
            result="Invalid Score";
        }else {
            result=(score>=90)? "A" : (score>=80)? "B" : (score >=70)? "C" : (score>=60)? "D" : "F" ;
        }
        return result;
    }
}





