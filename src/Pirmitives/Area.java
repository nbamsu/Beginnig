package Pirmitives;

public class Area {
    public static void main(String[] args) {

        int k=7;
        int n=3;
        int result=k++ * ++n / ++n % k + n - k++;
         //7* 4 = 28
        //k=7; n=4;
        //n=5;
        // 28/5= 5
        //k=8; n=5
        //5%8=5
        //8+5=13
        //13 -8= 5
        System.out.println("k is" +k);
        System.out.println("n is" +n);

    }
}
