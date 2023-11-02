package day22_MultiDimesionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {


        int [][] int2d={{1,2,3},{4,5,6,7},{8,9,10,11,12}};


        for(int [] each1DArray : int2d) {

            for (int eachElement : each1DArray) {
// Bunu sadece baştan sonra elementleri alırken kullanıyoruz. Reverse elde  etmek için kullanamayız.
             //   System.out.println(Arrays.toString(each1DArray)); // Yukarıda bulunan 3 Arrayi verir bize.
                System.out.println(eachElement); // Array içerisinde bulunan elementleri verir.
            }
        }
    }
}
