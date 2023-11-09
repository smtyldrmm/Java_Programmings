package day27_WrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str="123";
        int num=    Integer.parseInt(str); // parse method primitive tipte değer dönderir.

        System.out.println(num+1);
        System.out.println(str+1);

        String str2="10.5";
        double str3=Double.parseDouble(str2);
        System.out.println(str3);

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        System.out.println("---------------------------");

        String s2="123";
        Integer x=Integer.valueOf(s2);
        int y=Integer.valueOf(s2);
        System.out.println(x);
        System.out.println(y);

        String s3="1.5";
        double z=    Double.valueOf(s3);
        System.out.println(z);
        System.out.println("-------------------------------");


        char ch1='0';
        // isDigit
        boolean r2=    Character.isDigit(ch1);
        // isLetter
        boolean r3=     Character.isLetter(ch1);
        // isLetterOrDigit
        boolean r4=Character.isLetterOrDigit(ch1);
        //upperCase
        boolean r5=Character.isUpperCase(ch1);
        //lowerCase
        boolean r6=Character.isLowerCase(ch1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println("-----------------------------");

        String s="ab1cde2efg3hi4";
        int sum=0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each); // bu sayede sadece içerisinde rakam olan değerleri aldık.
            }

        }
        System.out.println(sum);
    }
}
