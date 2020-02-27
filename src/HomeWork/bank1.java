package HomeWork;

public class bank1 extends CheckingAccount {
    public bank1(int i) {
        super(i);
    }

    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int)(Math.random() * 100));
        //acct.amount = 0;//line n1 working
        //acct.changeAmount(-acct.amount);
        //acct.changeAmount(0);//working
       // acct.changeAmount(-acct.getAmount());//working

        System.out.println(acct.getAmount());
    }
}
