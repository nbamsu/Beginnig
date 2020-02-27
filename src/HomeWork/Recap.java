package HomeWork;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        /*int []number={1,2,3,5,0,7,4,6,9};
        int formula=9*10/2;
        int missing=0;
        for (int i=0;i<number.length;i++){
            missing+=number[i];
        }
        int result=formula-missing;
        System.out.println(result);*/

        int [] numbers={1,44,2,2,44,1,9,8,7};
        int []newNumber=new int[numbers.length];
        int number=numbers[0];
        newNumber[0]=number;
        for (int i=0;i<numbers.length;i++){
            for (int k=i+1;k<numbers.length;k++){
                if (number!=numbers[i]){
                    newNumber[i]=numbers[i];

                }
            }

        }
        System.out.println(Arrays.toString(newNumber));
    }
}
