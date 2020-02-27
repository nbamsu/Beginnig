package ClassMentoring;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] num={5,8,4,5,4, 6,7};
        //int []num2=new int[num.length];

        int sum=0;
        for (int i=0;i<num.length;i++){
            sum+=num[i];
            }
        System.out.println("sum of "+sum);

        String [] names={"Alex","Bob","Jon","Amy","Don"};
        String email="@gamil.com";
        for (int i=0;i<names.length;i++){
           names[i]+=email;

        }
        System.out.println(Arrays.toString(names));


    }

}
