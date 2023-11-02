package day22_MultiDimesionalArray;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {


        int [][] int2d={{1,2,3},{4,5,6},{7,8,9,10}};

        for (int i = 0; i < int2d.length; i++) { // i : index number of single dimensional array
            //System.out.println(Arrays.toString(int2d[i]));
            for (int j = 0; j < int2d[i].length; j++) {
                // int2d[i].length-1 sırayla arraylerin içinde elementlere ulaşmak için ve karakter uzunluğunu tespit etmek için kullanıyoruz.
                // j : index number of element
                //i : index number of single dimensional array

                System.out.print(int2d [i] [j]+" "); // Bu şekilde array içerisinde bulunan rakamları yazdırabiliriz.

            }
            /* şimdi sana aşağıda bulunan çıktının mantığını anlatacağım
            System.out.print(int2d [i] [j]+" "); bu print ile ilk Array olan 1,2,3 yazdırdık.
            Sonra ilk tarafa geçiyor ve System.out.println(); println yazısını görüyor new line verip
            sonraki i ve j değerlerine geçiyor. Onlar ne 4,5,6 bunları yazdırdıktan sonra tekrar
            println basıyor ve sonra arrayimiz olan 7,8,9,10 yazdırıyor.

             */
            System.out.println();

        }
    }
}
