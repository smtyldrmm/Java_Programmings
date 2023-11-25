package day37_Inheritance.PhoneTest;

public class PhoneShop {
    public static void main(String[] args) {

    Iphone iphone1=new Iphone ("Apple","Iphone 12","6.7 Inches",720,"Gold");

    Samsung samsung1=new Samsung("Samsung","Galaxy s5","6 Inches",90,"White");

    Nokia nokia1=new Nokia("Nokia","Brick","4 Inches",500,"Gray");

    System.out.println(iphone1);
    System.out.println(samsung1);
    System.out.println(nokia1);

    iphone1.call(911);
    iphone1.text(123456789);
    iphone1.email("yildirimsamet1@gmail.com");

    samsung1.call(112);
    samsung1.text(12345);
    samsung1.freeze();

    nokia1.selfDefense();


}
}
