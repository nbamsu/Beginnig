package Polymorphism3;

public class CreditAccount extends BankAccount {
    public CreditAccount(String name, int balance) {
        super(name, balance);
    }
    public static void printBankDetails(BankAccount bankAccount){
        bankAccount.details();
        System.out.println("First method");
    }
    public static void printBankDetails(CreditAccount creditAccount){
        creditAccount.details();
        System.out.println("Second method");
    }

    public static void main(String[] args) {
        BankAccount b1=new CreditAccount("VISA",1000);
        BankAccount b2=new BankAccount("MASTER CARD",500);
        CreditAccount c1=new CreditAccount("VISA",800);
        CheckingAccount ca1=new CheckingAccount("DIscovery",500);

        printBankDetails(b1);
        printBankDetails(b2);
        printBankDetails(c1);
        printBankDetails(ca1);
    }

}
