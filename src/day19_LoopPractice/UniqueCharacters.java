package day19_LoopPractice;

public class UniqueCharacters {
    public static void main(String[] args) {


        String str = "aabccdeefghhh";
        String result = "";


        for (int j = 0; j < str.length(); j++) {
            // with str.charAt, I convert String to char
            char ch = str.charAt(j); //'A'
            // count represent frequency of the char
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                // compares each and ch ( both of them have same chars)
                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }

// if the frequency of the character is 1, then the character is unique
//            if (count == 1) {
//                result += ch;
//            }


            if(count != 1){
                continue;
            }

            result += ch;

        }
           System.out.println(result);
        }

    }



    /*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf
 */
