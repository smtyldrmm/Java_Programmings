package day41_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Block");
        }catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
        }finally {
            // finally block always gets executed regardless of the exception is being handled or not handled
            // to stop the execution of finally block : System.exit(0);

            System.out.println("Finally Block");
        }
    }
}
