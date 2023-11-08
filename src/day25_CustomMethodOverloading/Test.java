package day25_CustomMethodOverloading;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str="Java Programming Language";
        String str1="Wooden Spoon";
        StringUtility.printEachChar(str);
        String reverse= StringUtility.reverse(str1);
        System.out.println(reverse);
        String word="Civic";
        boolean palindrome= StringUtility.isPalindrome(word);
        System.out.println(palindrome);
        System.out.println("-----------------------");
        String [] names={"Anna", "Java","Pyhton","Racecar","Mom","Cydeo"};
        int count=0;
        for (String each: names){
            if(StringUtility.isPalindrome(each)){// isPalindrome methodunu aldık
                // bu method verilen String ile karşılatırma yaptığı için her palindrome
                // kelime birbirine eşit olduğunda  count 1'er arttırmasını söyledik.
                count++;
            }
        }
        System.out.println(count);
        System.out.println("------------------------");
        String s2="aaaaaaabbbbbbcccccddeff";
        String nonDup= StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);
    }
}
