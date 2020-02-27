package Exception;

public class VoteEligibility {
    public static void main(String[] args)throws  Exception, Error{
        int age=17;
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else{
            throw new Exception ("You are not eligible to vote");
        }
        System.out.println("After if statement");
    }
}
