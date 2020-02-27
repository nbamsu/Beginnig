package ARRAY;

public class FindMissingNumber {
    public static void main(String[] args) {
        int [] num={0,7,8,3,4,1,6,2,9};
        //you have sequence of the int number starting from
        //0 to 9 find missing number from this sequence
        int totalCount=9*10/2;  //total number 45
        int sum=0;
        for (int i=0;i<num.length;i++){
            sum+=num[i];

        }
        int missingNumber=totalCount-sum;
        System.out.println(missingNumber);
    }
}
