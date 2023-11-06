package day24_CustomMethod_Return;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(15);

    }

    //create a method that can print name of the day
    public static void nameOfDay(int number) {
        if (number < 1 || number > 7) {
            System.out.println("Invalid");
            return;
   /* Bu örneği şundan dolayı yaptık. return sadece değer döndüreceğimiz zaman kullanılır. Ama ayrıca
   methodtan çıkmak istediğimiz de yine return kullanırız.Yukarıda istediğimiz değerlerin dışında
   bir değer gelirse methodtan çıkmasını ve geçersiz değer yazdırmasını istedik.
   Yani void kullanırken methodtan çıkmak istiyorsak yine return kullanabiliriz.
    */
        }
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Sunday");
        }
    }
}