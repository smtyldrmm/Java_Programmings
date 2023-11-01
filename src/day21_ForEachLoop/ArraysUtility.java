package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int [] nums={7,12,38,24,5};
        System.out.println(Arrays.toString(nums));
        // toString converts the array object(single dimensional) to string, returns string
        System.out.println(nums[1]);
        // yukarıda ki gibi elementi yazdırırken direk yazdırabiliriz.
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        // rakamları küçükten büyüğe doğru sıralamaya yarar.
        System.out.println("minimum number:" + nums[0]);
        System.out.println("maximum number:" + nums[nums.length-1]);

        String [] names={"Samet","Sevinc","Kayra","Uras","Yildirim","Boncuk"};
        Arrays.sort(names);
        // String için harfleri sıralayarak yazar.
        System.out.println(Arrays.toString(names));
        String [] words={"SAmet","Samet"};
        System.out.println(Arrays.toString(words));
        // Büyük harf içeren karakterleri yazarken öncelik verir.
        System.out.println("-------------------------");
        int [] num1={1,2,3};
        int [] num2={1,3,2};
        boolean isEqual=Arrays.equals(num1,num2);
        System.out.println(isEqual);
        Arrays.sort(num1);
        Arrays.sort(num2);
        boolean b1= Arrays.equals(num1,num2);
        System.out.println(b1);
        System.out.println("--------------------------");


    }
}
