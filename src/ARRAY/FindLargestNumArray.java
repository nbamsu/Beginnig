package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargestNumArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers");
        int[]nums=new int[7];
        for(int i=0;i<nums.length;i++){
            nums[i]=input.nextInt();
            //if(i>=20);

        }
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if (nums[i]>50){
                System.out.println(nums[i]);
            }
        }
    }
}
