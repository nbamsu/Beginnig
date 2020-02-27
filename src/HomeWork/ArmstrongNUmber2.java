package HomeWork;

public class ArmstrongNUmber2 {
    public static boolean armstrongNumber(int number){
        int digit=0;
        int n=number;
        int sum=0;
        do{//153
            digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }while(n!=0);
        if(sum==number){
            return true;
        }
        return false;
    }
}
