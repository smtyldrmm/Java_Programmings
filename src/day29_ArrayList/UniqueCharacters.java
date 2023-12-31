package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str="abbbbcccccdddddeeeffffgghhhjjjklllllm";
        String [] arr=str.split("");
        // Aşağıda bulunan ArrayListe çevirme şeklini alt tarafta bulunan örnekte ki gibi de yapabiliriz.
        // ArrayList<String> list= new ArrayList<>(Arrays.asList(str.split("")));
        // Yukarıdaki Stringi bu şekilde ArrayListe çevirebiliriz.

        ArrayList<String> list= new ArrayList<>(Arrays.asList(arr));

        System.out.println(list);

        String unique="";
        for (String each : list) {
            int frequency= Collections.frequency(list,each);
            if(frequency==1){
                unique+=each;
            }
        }
        System.out.println(unique);

    }
}
