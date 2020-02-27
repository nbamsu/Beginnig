package Variables;

public class Datatypes {
    public static void main(String [] args){

        int studentNumber=40;
        System.out.println(studentNumber);
        /*
        appleFreshMarket=1;
        aplleWholeFoods=2;
        appleWalmart=3;
         */

        int appleFreshMarket=40;
                int appleWalmart=18;
                int appleWholeFoods=23;
                int  sumApple=appleFreshMarket + appleWholeFoods + appleWalmart;
                int paymentFreshMarket=appleFreshMarket*1;
                int paymentWholeFoods=appleWholeFoods*2;
                int paymentWalmart=appleWalmart*3;
                //find total payment for all the apple
        int totalpayment=paymentFreshMarket+paymentWholeFoods+paymentWalmart;


                System.out.println("This is my sum of apple " + sumApple);
                System.out.println("This is totaal amount$"+totalpayment);
                // TASK --> Add one more apple from Walmart.Value is 18, Find sum of all apples.

    }
}