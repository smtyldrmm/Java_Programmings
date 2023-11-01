package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {


        String [] group1={"Kayra", "Uras", "Sevinc", "Samet"};
        String  [] group2={"Maria","Aygun","Duygu", "Suat","Valeriy"};
        // to make sure Array has enough capacity to involve the group1 and  group2
        String [] student=new String[group2.length+group1.length];

        // arraylari birleştirmek için for loop ile her bir arrayin değerlerini alıyoruz.
        int i=0;

        for (String each : group1) {
            student[i++]=each;
    /*Yukarıda şunu yapmaya çalıştık.student[i] karşılığı arrayin kaç değerden oluşacağını gösteriyor.
    each her döndüğünde bir arttır dedik. each = {"Ali","Layan"...} şeklinde olacak ve
    biz bu student arrayin içine attık ve aşağı tarafa bu değeleri alarak geldi.  */

        }
        for (String each : group2) {
            student[i++]=each;
            /*Yukarıda aldığı değerlere ve Arrayin kaç değerden oluştuğunu belirten rakam ile
            yani student[4]={"Ali", "Layan",..} şeklinde değerleri aldıktan sonra alt tarafta diğer değerleri
            eklemeye devam edyoruz
            Ve sonuç student[9]={"Ali", "Layan",.."Suat","Valeriy"}; şeklinde devam ediyor.
             */
        }
        System.out.println(Arrays.toString(student));

        char [] ch1={'A','B','C','D'};
        char [] ch2={'E','F','G'};
        char [] merged=new char[ch1.length+ch2.length];

        int j=0; // Bu değeri arrayin uzunluğu toplam dönen karakter  olsun diye yazdık.

        for (char each : ch1) {
            merged[j++]=each;

        }
        for (char each : ch2) {
            merged[j++]=each;
        }
        System.out.println(Arrays.toString(merged));
    }
}
