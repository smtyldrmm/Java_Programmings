package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperation {
    public static void main(String[] args) {
        // addAll(CollectionType) :  add collection of values to the arrayList
        // removeAll ( CollectionType) : remove collection all matching values from arrayList
        // retainAll (CollectionType)  : remove collection all UNMACTHING values from arrayList
        // containsAll (CollectionType)  :

        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,8,9,10,3,5));
        System.out.println(list);
        list.removeAll(Arrays.asList(3,5,8));// it removes all of the given element
        System.out.println(list);

        System.out.println("--------------------------");
        ArrayList<Integer> number= new ArrayList<>();
        number.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        number.retainAll(Arrays.asList(10,30,50));
        // Sadece belirtilen değerleri tutar, diğer bütün değerleri siler.
        System.out.println(number);

        System.out.println("-------------------------------");

        ArrayList<Integer>nums=new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean r1=     nums.containsAll(Arrays.asList(2,5,8,10));
        // Eğer bütün değerler varsa true, herhangi bir değer yoksa false dönderir.
        System.out.println(r1);

        System.out.println("---------------------");

        String [] names={"samet","sevinc","kayra","yildirim"};
        /* Aşağıdaki örnekte non-primitve type direk olarak kullanamaıyoruz. Neden
        çünkü bizden collection Type kullanarak eklememizi istiyor. O yüzden
        Arrays.asList(names) şeklinde arrayi arrayListe dahil ettik.*/
        ArrayList<String> nameList=new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);

        System.out.println("--------------------");
        Integer [] arr= { 1,2,3,4,5,6,7,8,9,10};
        // primitive type olanları direk collection type üzerinden arrayList'e ekleyemeyiz.
        // O yüzden yukarıda bulunan int primitive değişkenini Integer obejectine değiştirdik.
        ArrayList<Integer> listt=new ArrayList<>(Arrays.asList(arr));

        int [] arr2={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer>list3=new ArrayList<>(converToArrayList(arr2));
        System.out.println(list3);
    }
    public static ArrayList<Integer> converToArrayList(int [] array){
        ArrayList<Integer> list=new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
