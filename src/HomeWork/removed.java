package HomeWork;

import java.util.Arrays;

public class removed {
    public static void main(String []args){
	int []nums={1,1,2,2,3,4,4,5,6,6,7};


//
//byte starting = 3;
//short firstValue = 5;
//int secondValue = 7;
//int functionValue = (int) (starting/2 + firstValue/2 + (int) firstValue/3 ) + secondValue/2;
//System.out.println(functionValue);

	int []removed=new int[nums.length];
		Arrays.sort(nums);
	int number=nums[0];
		removed[0]=number;

	for(int i=1;i<nums.length;i++){

		if(number!=nums[i]){
			removed[i]=nums[i];

		}
		number=nums[i];

	}

}

}
