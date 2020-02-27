package Exception;

public class DebitAccount extends Account {
    int balance;
    public void withdraw(int amount)throws Error{
        if (balance<amount){
            throw new InsufficientBalanceException("Your balance "+ balance+" less than transaction amount "+amount);
        }else if(balance>=amount){
            balance-=amount;
        }
    }
    public void deposite(int amount)throws ArithmeticException{
        balance+=amount;
    }

    public static void main(String[] args) {
        DebitAccount debitAccount=new DebitAccount();
        debitAccount.balance=100;
        debitAccount.deposite(50);
        debitAccount.withdraw(100);
        debitAccount.withdraw(55);

    }

}
