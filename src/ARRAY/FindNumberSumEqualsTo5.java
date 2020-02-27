package ARRAY;



public class FindNumberSumEqualsTo5 {
    public static void main(String[] args) {
        int []number={0,1,2,3,4,5,6,7,8,9};

        for (int i=0;i<number.length;i++){
           // System.out.println("I is "+i);

            for (int k=i+1;k<number.length;k++){
                if (number[i]+number[k]==6){
                    System.out.println(number[i]+" and "+number[k]);
                }

            }

        }



    }

}
