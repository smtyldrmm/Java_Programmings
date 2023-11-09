package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {
        String password="Cydeo1990@";

        boolean r1=password.length()>=8 && !password.contains(" ");
        boolean r2=false; // has upper case
        boolean r3=false; // has lower case
        boolean r4=false; // has special char
        boolean r5=false; // has a digit
// Aşağıda neden for each kullandım. Çünkü for döngüsü ile her bir karakteri tek tek kontrol edecek ve
        // o if değeri varsa true dönderecek böylece sırayla tüm karakterleri kontrol etmiş olacağız.
        char [] chars = password.toCharArray(); // password karakterlerine ayırarak arraye aldım.
        for (char each : chars) {
            if(Character.isUpperCase(each)){
                r2=true;
            }else if (Character.isLowerCase(each)){
                r3=true;
            } else if (Character.isDigit(each)) {
                r5=true;
            }else{
                r4=true;
            }

        }
        boolean isStrongPassword=r1 & r2 & r3 & r4 & r5;
        System.out.println("Strong Password : "+ isStrongPassword);
    }
}
/* write a program that can verify if a password is a strong password
1- Password must be at least 8 characters long , should not contain space
2- Password should contain at least one upper case letter
3- Password should contain at least one lower case letter
4- Password should contain at least one special character
5- Password should contain at least one a digit
 */