package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str="java";
        char [] chars=str.toCharArray(); // ==> {j,a,v,a}
        System.out.println(Arrays.toString(chars));

        for (char each : chars) {
            System.out.print(each);
        }
        System.out.println();
        System.out.println("--------------------------------------");

        String sentence="Wooden Spoon";
        String [] words=sentence.split(" "); // split verilen karaktere göre Stringi ayırır.
        // Array olarak spliti kullanabileceğimiz için [] bunları unutma.
        System.out.println(Arrays.toString(words));
        String email="yildirimsamet1@gmail.com";
        String [] email2=email.split("@");
        System.out.println(Arrays.toString(email2));
        for (String each1 : email2) {
            System.out.println(each1);
            String name="Samet";
            String  [] name1=name.split(""); // sadece String olarak kullanamayız Array olarak değeri verir.
            System.out.println(Arrays.toString(name1));

            String s="Today is nice day. Today is Monday. Today we learn Java";
            String [] s1=s.split("\\. "); // Nokta kullanırken  ayırmak için kesinlike double backslash kullanılmalıdır.
            // Çok önemli splitte ayırmak için nokta kullanıyorsan double backslash koymak zorundasın.
            System.out.println(Arrays.toString(s1));
        }



    }
}
