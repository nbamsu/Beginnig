package ARRAY;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAssigning {
    public static void main(String[] args) {
        int [] nums;
        nums=new int[]{4,5,6,7};
        int [] numbers=nums;
        //all the values of the nums will be assigned to the numbers array
        System.out.println(Arrays.toString(numbers));
        //to be able to use the toString we need to give the name array as a parameter


    }
}
