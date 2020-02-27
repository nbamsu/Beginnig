package ObjectPractice;

public class BankAccount {
    String personName;
    String bankName;
    int accountNumber;
    double balance;
    String accountOpenDate;
    String userName;
    String password;


    public void bankInfo(){
        System.out.println("Castomer name is: "+personName);
        System.out.println("Bank name is: "+bankName);
        System.out.println("Bank account number is: "+accountNumber);
        System.out.println("Your balance is: "+balance);
        System.out.println("Opened date is: "+accountOpenDate);
        System.out.println("Your user name and password is: "+userName+","+password);

    }
    public double deposit(double amount ){
        balance+=amount;
        return balance;

    }
    public double withdraw(double amount){
        if (balance>=amount){
            balance-=amount;
        }else{
            System.out.println("You can not withdraw the money");
        }

        return balance;
    }
    public boolean logIn(String uName,String pword){
        if (uName.equals(userName)&&pword.equals(password)){
            System.out.println("Welcome to "+bankName+" account");
            System.out.println("You have successfully loged in to your account");
            bankInfo();

            return true;

        }else{
            System.out.println("Your username or password incorrect. Please try again later");
        }
        return false;
    }
    public void signUp(String personName, int accountNumber, double balance, String userName, String password, String accountOpenDate){
        this.personName=personName;
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.userName=userName;
        this.password=password;
        this.accountOpenDate=accountOpenDate;


    }
    public void getInstruction(){
        System.out.println("To display info press 0");
        System.out.println("To deposit press 1");
        System.out.println("To make withdraw press 2");
        System.out.println("To Sign Up press 3");
        System.out.println("To log In press 4");
        System.out.println("To exit the application press 5");
    }

}
