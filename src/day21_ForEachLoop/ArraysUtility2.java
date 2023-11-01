package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {

        String [] student={"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};
        String [] earlybirds= Arrays.copyOf(student,5); // ilk 5 elementi döndürüp verir.
        // Array içerisinden elementleri almak için kullanırız.
        System.out.println(Arrays.toString(earlybirds));
        String [] otherOnes=Arrays.copyOfRange(student,3,6);
        // copyRangeOf sadece belli aralıkltan değerleri çekmek için kullanılır.
        System.out.println(Arrays.toString(otherOnes));

    }
}
