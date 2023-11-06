package day23_CustomMethod_Void;

public class CustomMethodPractice {


        public static void main(String[] args) {
            helloCydeo5Times();
            helloWorld5Times();
            evenNumbers();
        }
        public static void helloWorld5Times(){
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello World");

            }
        }
        public static void helloCydeo5Times(){
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello Samet");

            }
        }
        public static void  evenNumbers() {
            int even = 0;
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    even = i;
                    System.out.println(even);
                }

            }
        }
}


