package ARRAY;


import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {
        int [] arr={4,3,1,30,10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int indexNumber=Arrays.binarySearch(arr,10);
        System.out.println(indexNumber);

    }
}
