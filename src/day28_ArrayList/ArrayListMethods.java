package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        // add : add element to arrayList
        numbers.add(10); // 0 index
        numbers.add(20); // 1 index
        numbers.add(30); // 2 index
        numbers.add(40); // 3 index
        numbers.add(50); // 4 index

        numbers.add(2,25); // indexi belirterek değişim değil ayrıca bir element eklememizi sağlar.
        numbers.add(5,45);
        System.out.println(numbers);
        System.out.println(numbers.size()); // size ArrayList'in kaç değerden oluştuğunu verir.
        int lastİndex=numbers.size()-1;
        System.out.println(lastİndex);

        Integer num= numbers.get(3);
        int num1=numbers.get(2);
        System.out.println(num); // ArrayList içinden elementi almak için kullanırız.
        System.out.println(num1); // Üstteki gib wrapper class ile Integer ve int değerleriyle elementi çekebiliriz.
        System.out.println("---------------------------------");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)); // Tek tek bütün elementleri for döngüsü ve get ile bu şekilde çekebiliriz.
            ArrayList<String> list=new ArrayList<>();
            list.add("Java");
            list.add("Python");
            list.add("Java");
            list.add("C#");
            list.add("Ruby");

            list.set(2,"JavaScript"); /* set method replace method ile aynıdır. Ama bu ArrayList için
             kullanılır. Önce index yazıp sonra hangi yeni değeri vermek istiyorsak onu yazarız. */
            list.set(3,"C++"); // ArrayList size değişmez.
            System.out.println(list);

            ArrayList<String> employees=new ArrayList<>();
            employees.add("Suat");
            employees.add("Aygun");
            employees.add("Olga");
            employees.add("Neira");
            employees.add("Ali");
            employees.add("Samet");
            employees.add("Kayra");
            System.out.println(employees);

            employees.remove(0); // belirtilen indexi ArrayList içerisinden çıkartır.

            System.out.println(employees);
            employees.remove(0); // Yeniden 0 numaralı indexi ArrayList içerisinden çıkartır.

            employees.remove(employees.size()-1); // son indexi ArrayListden kaldırmak için bu yapıyı kullanırız.
            System.out.println(employees);
            employees.remove("Samet"); // remove içerisinden object seçerek bu şekilde obejecti kaldırabiliriz.
            System.out.println(employees);


        }

    }
}
