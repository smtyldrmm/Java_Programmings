package day19_LoopPractice;

public class FrequencyOfCharacters {
    public static void main(String[] args) {


        String str = "aabbbcccdde";
        String result = ""; // result will be like a2b3c3d2e1


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // get each char from string with loop
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
            //to find the frequency of each character
                char each = str.charAt(i);
                // loop in the loop I get char of String again and check the same ones
                if(ch == each){
                    count++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            // if I don't use continue, result will be a2a2b3b3b3c3c3c3d2d2e1
            // with continue I get each char just one time
            }

            result += ch;
            result += count;
        }


        System.out.println(result);








    }

}
/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */
