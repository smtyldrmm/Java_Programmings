package day31_Constructor;

public class CapitalOne {
    public static void main(String[] args) {
    BankAccount account1=new BankAccount();
    account1.setInfo("Samet Yildirim",1234567);
    System.out.println(account1);

    account1.deposit(1000);
    account1.checkBalance();

    account1.withdraw(800);
    account1.checkBalance();

    System.out.println("--------------------");

    BankAccount account2=new BankAccount();
    account2.setInfo("Kayra Yildirim",58749654);

}
}


