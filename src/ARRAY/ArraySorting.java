package ARRAY;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int []arr={1,5,3,10,8};
        //System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);//
        System.out.println(Arrays.toString(arr));
        //CReate another array and store the arr value, largest to smallest
        int [] largestSmallest=new int[arr.length];
        for( int i=0,k=arr.length-1;i<arr.length;i++,k--){
            largestSmallest[i]=arr[k];

            //System.out.println("i "+i);
            //System.out.println("k "+k);
        }
        System.out.println("Largest to smallest "+Arrays.toString(largestSmallest));


    }
}
