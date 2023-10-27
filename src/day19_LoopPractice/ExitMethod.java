package day19_LoopPractice;

public class ExitMethod {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) { //i: 0, 1, 2, 3, 4

            if(i == 3){
//   break;    // terminates the loop -- it gives 0 1 2 Wooden Spoon
continue; //terminates the current iteration of the loop-- it gives 0 1 2 4 Wooden Spoon
//System.exit(0); // terminates the program -- it gives 0 1 2
            }

            System.out.println(i);
        }


        System.out.println("Wooden Spoon");

    }
}
