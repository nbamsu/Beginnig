package ObjectPractice;

public class BankAccountTest {


    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        account.personName="Baha";
        account.bankName="Chase";
        account.accountNumber=1234567;
        account.accountOpenDate="10.05.2019";
        account.userName="BahaBaha";
        account.password="don't touch";
        account.bankInfo();
        account.deposit(1000);
        account.withdraw(350);
        account.withdraw(700);
        System.out.println("The balance is: "+account.balance);
    }
}
