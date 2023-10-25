package day20_Arrays;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        // toString = convert array to String
        char [] alphabet=new char[26]; // Z-A
        alphabet[0]='Z';
        //System.out.println(Arrays.toString(alphabet)); //print the whole array
        // System.out.println(alphabet[0]);              // print the element of array so it gives us a char
        char ch='Z';
        for (int i = 0; i <alphabet.length ; i++) {
            alphabet[i]=ch--;

        }
        System.out.println(Arrays.toString(alphabet));

        for(char a=0, b='Z';a<alphabet.length; a++, b--){
            alphabet[a]=b;
        }
        System.out.println(Arrays.toString(alphabet));


    }


}

