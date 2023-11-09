package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {
        String password="cLdeo1990@";
        int countUpperCase=0;
        int countLowerCase=0;
        int countDigit=0;
        int countSpecialChar=0;

        for (int i = 0; i < password.length(); i++) {
            char each=password.charAt(i);
            if(Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if(Character.isDigit(each)){
                countDigit++;
            }else{
                countSpecialChar++;
            }
        }
        System.out.println(countLowerCase);
        System.out.println(countUpperCase);
        System.out.println(countDigit);
        System.out.println(countSpecialChar);

        boolean hasUpperCase= countUpperCase>0;
        boolean hasLowerCase= countLowerCase>0;
        boolean hasSpecialChar= countSpecialChar>0;
        boolean hasDigit=countDigit>0;
        boolean strongPassword= password.length()>=8 && !password.contains(" ") && hasDigit && hasLowerCase
                && hasSpecialChar && hasUpperCase;
        System.out.println("strongPassword = " + strongPassword);;
    }
}
