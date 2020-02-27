package WrapperClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfPractice {
    public static void main(String[] args) {
       int [] num={1,3,4,6,2,17,54};
         String []names={"Aaron", "John","Kate","Mary"};
        List<String> names2= Arrays.asList(names);
      //  System.out.println(Arrays.toString(num)+" ");
        int temp=num[0];
        for (int i=0;i<num.length;i++){
            if (temp<num[i]){
                temp=num[i];

            }
        }
        System.out.println(temp);

        int number=100;
        int preNum=0;
        int nextNum=1;
        int sum=0;
        for (int i=1;i<number;i++){
            if (nextNum<=number){
                sum=preNum+nextNum;
                preNum=nextNum;
                nextNum=sum;
                System.out.println(preNum);
            }
        }

    
    }
}
