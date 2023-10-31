package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1="acdb";
        String str2="dbca";
        // String doesn't have sort method
        //"abc".toCharArray(); ==> {a,b,c}
        char [] ch1=str1.toCharArray();
        char [] ch2=str2.toCharArray(); // toCharArray String'i char olarak ayırmak için kullanılıyor.
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println(anagram);
    }
}
