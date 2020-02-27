package ARRAY;

import java.util.Arrays;

public class FindValueNumbers {
    public static void main(String[] args) {
        int[] num={10,5,25,15,35,18,28,90};
        int count=0;
        int sum=0;
        Arrays.sort(num);
        for (int i=0;i<num.length;i++){

            if (num[i]>10&&num[i]<30) {
                System.out.println(num[i]);
                count++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(num));



        for (int numb:num){

            System.out.println("Foreach loop print is "+numb);
            sum+=numb;
        }

        System.out.println(sum);

    }
}
