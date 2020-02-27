package ProjectDay;

public class ArraySmalestNumber {
    public static void arrayLargestMethod(int[]nums){
        /*
        Create a method it will take one parameter as a int array and
        the method will return largest value from array.
        (Use largest value without using sort method
         */
        int smalest=nums[0];
        int i=0;
        for( i=1;i<nums.length-1;i++){
            if(smalest<nums[i]){
               nums[i]=smalest;
            }
        }
        System.out.println(smalest);
    }
    public static void main(String[] args) {
        ArraySmalestNumber arr=new ArraySmalestNumber();

        arrayLargestMethod(new int[]{12,14,15});
    }
}
