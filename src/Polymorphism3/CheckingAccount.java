package Polymorphism3;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String name, int balance) {
        super(name, balance);
    }
    public static void printBankDetails(BankAccount bankAccount){
        bankAccount.details();
    }
    public static void printCheckingAccount(CheckingAccount checkingAccount){
        checkingAccount.details();
    }
}
