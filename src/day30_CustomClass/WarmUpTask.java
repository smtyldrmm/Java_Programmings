package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {

    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        // swap the first number and last number

        Collections.swap(numbers,0,numbers.size()-1);
        System.out.println(numbers);

        System.out.println("--------------------");

        // Sıfırları nasıl son tarafa atarız. Onun çözümü;
        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);

        int size= list.size();
        list.removeAll(Arrays.asList(0));
        int newSize= list.size();

        int totalNumberOfZeros=size-newSize;
        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);
        System.out.println("--------------------");
        // Sıfırları nasıl sona atarız ikinci çözüm.
        ArrayList<Integer> list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result=new ArrayList<>();
        for (Integer each : list2) {
            if(each!=0){
                result.add(each);
            }
        }
        for (Integer each : list2) {
            if(each==0)
                result.add(each);

        }
        System.out.println(result);

        System.out.println("-------------------------");

        String str="ABCD123$%#@456EFG";
        /* Bu Stringi aşağıdaki char ArrayListe direk ekleyemeyiz. Bunun için for döngüsü kullanabiliriz*/

        ArrayList<Character> chars=new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character> letters=new ArrayList<>(chars);
        System.out.println(letters);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digits= new ArrayList<>(chars);
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> specilChar=new ArrayList<>(chars);
        //Aşağıdaki gibi iki farklı şekilde special karakterleri ayırabiliriz.
        //specilChar.removeAll(letters);
        //specilChar.removeAll(digits);
        specilChar.removeIf(p -> Character.isLetterOrDigit(p));
        System.out.println(specilChar);







    }
}

