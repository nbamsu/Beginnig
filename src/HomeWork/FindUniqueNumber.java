package HomeWork;

import java.util.Arrays;

public class FindUniqueNumber {
    public static void main(String[] args) {
        int sum=0;
        int mul=1;
        String str="";
        for (int i=1;i<=10;i++){
           // str=str+"*";// "*" its for String output
             System.out.println(1+"x"+i+"="+(1*i));
            //System.out.println(str);
        }




        String str2="***********";
        for (int i=0;i<=10;i++){
            str2=str2.substring(1);
            System.out.println(str2);

        }
        int [] num={1,1,2,2,3,4,4,5,5};


        for (int i=0;i<num.length;i++){
            //int count=0;
           // for (int k=0;k<num.length;k++){
                if (num[i]==num[i+1]){
                    i++;


                }else{
                    System.out.println(num[i]);

            }

        }

        int [] nums={1,1,2,2,3,4,4,5};
        for (int i=0;i<nums.length;i++){
            int count=0;
            for (int k=0;k<nums.length;k++){
                if (num[i]==num[k]&&i!=k){
                    count++;

                }
            }
            if (count==0){
                System.out.println(num[i]);
            }
        }


    }
}
