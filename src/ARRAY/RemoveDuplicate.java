package ARRAY;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] nums={1,2,3,5,1,3,5,7};
        int [] removed = new int[nums.length];

        Arrays.sort(nums);
        //1,1,2,3,3,5,5,7
        int number=nums[0];
        removed[0]=number;
        for (int i=1;i<nums.length;i++){
            if (number!=nums[i]){
                removed[i]=nums[i];
            }
            number=nums[i];
        }
        System.out.println(Arrays.toString(removed));

    }
}
