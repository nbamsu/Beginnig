package HomeWork;

import java.util.Arrays;

public class ReversNumbersArray {
    public static void main(String[] args) {
        int [] num= {1,2,3,5,6,11,8,9,10,7};

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        int [] largestSmallest=new int[num.length];
        for (int i=0,k=num.length-1;i<num.length;i++,k--){
            largestSmallest[i]=num[k];
        }
        System.out.println(Arrays.toString(largestSmallest));


            for (int i=0;i<num.length;i++) {


                if (num[i] % 2 != 0) {
                    System.out.println("This is Odd numbers :" + num[i]);
                    //}else if (num[i]%2==0){

                }
            }

            for (int k=0;k<num.length;k++){
              if (num[k]%2==0){
                  System.out.println("This is even number : "+num[k]);
              }



            }


}}
