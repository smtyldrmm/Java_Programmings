package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Samet";
        int age = 33;
        String citizen = "Turkey" ;

        boolean isEligible = age >= 21 && citizen == "Turkey"; //True

        // Eligible
        if(isEligible){ // True
            System.out.println("Eligible");
        }

        //Not Eligible
        if(!isEligible) { // !True ==> not true==> false
            System.out.println("Not Eligible");

        }
    }
}

