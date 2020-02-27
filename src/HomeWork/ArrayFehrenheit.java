package HomeWork;

import java.util.Arrays;

public class ArrayFehrenheit {
    public static void main(String [] args){
    int [] fehrenheit={67,55,27,49,65,80};
    int celsius;
    for (int i=0;i<fehrenheit.length;i++){
         celsius=(fehrenheit[i]-32)*5/9;
        System.out.println(celsius+" C");

    }
    int [] numbers={12,24,3,11,56,32};
        //Arrays.sort(numbers);
    for (int k=0;k<numbers.length;k++){
        int result;
        result=numbers[k]*numbers[k];
        System.out.println(result);

    }

    int [] number2={1,1,2,2,3,4,4};
    int temp=0;
    for (int j=0;j<number2.length;j++){
        for (int m=1+j;m<number2.length;m++){

            if (number2[j]==number2[m]){


                System.out.println(number2[m]);
            }
        }



    }





    }
}
