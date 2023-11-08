package day25_CustomMethodOverloading;

public class SumOfNumbers {
    /* Overloading benzer işleri yapan methodlara aynı ismi vermek üzerine kuruludur. Her bir method
     * ismini tek tek ezberlemek yerine aynı ismi vererek kolay hatırlamayı amaçlar. Ama isimleri aynı olsa
     * içerisinde bulunan parametrelerden en az bir tanesi farklı olmalıdır. */
    public static void main(String[] args) {
        int sum1=sumOfNum(50,60);
        System.out.println(sum1);
        int sum2=sumOfNum(30,40,50);
        System.out.println(sum2);
        int sum3=sumOfNum(20,60,60,80);
        System.out.println(sum3);



    }
    public static int sumOfNum(int num1,int num2){return num1+num2;}
    public static int sumOfNum(int num1,int num2,int num3){return num1+num2+num3;}
    public static int sumOfNum(int num1,int num2,int num3,int num4){return  num1+num2+num3+num4;}
}
