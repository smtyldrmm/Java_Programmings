package day20_Arrays;

public class UniqueElements {
    public static void main(String[] args) {


        String [] words={"Java","Java","C#","Pyhton","Pyhton"};
        // I write this loop to get words' values one by one
        for (int j = 0; j < words.length; j++) {
        // To check the same ones I create temporary variable
        String element = words[j];
       // with "count" variable I try to found repeater
        int count = 0;
        for (int i = 0; i < words.length; i++) {
        // If temporary variable which is element is equal to any words array, it increases the count
        if (words[i].equals(element)) {
                    count++;
                }

            }
        // If count is equal to 1, this meaning is it is unique
            if(count==1){
                System.out.println(element);
            }
        }
    }
}
