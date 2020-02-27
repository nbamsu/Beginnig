package Pirmitives;

public class homework {
    public static void main( String[] args){

        int value=758;
        int oneHundrets=value/100;
        int onehundretsRemaider=value%100;
        int fyfty=onehundretsRemaider/50;
        int fyftyRemainder=onehundretsRemaider%50;
        int twenty=fyftyRemainder/20;
        int twentyRemainder=fyftyRemainder%20;
        int ten=twentyRemainder/10;
        int tenRemiander=twentyRemainder%10;
        int five=tenRemiander/5;
        int fiveremainder=tenRemiander%5;
        int one=fiveremainder/1;
        int oneRemainder=fiveremainder%1;
        System.out.println(value);

        System.out.println("this is total amount of Hundrets $"+oneHundrets);
        System.out.println(fyfty);
        System.out.println(twenty);
        System.out.println(ten);
        System.out.println(five);
        System.out.println(one);




    }
}
