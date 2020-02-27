package ClassMentoring;

import java.util.Arrays;

public class ArraysTask {
    public static void main(String[] args) {
        int [] nums={3,5,8,9};
        for (int i=0;i<nums.length;i++){
           // System.out.println(nums[i]);
        }
    String [] names={ "Jon","Danny","Tonny","Ariet"};
        Arrays.sort(names);
        if (names.length<5){
            System.out.println(Arrays.toString(names));
        }
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));


        String [] names2={ "Jon","Danny","Tonny","Ariet"};
        Arrays.sort(names2);
        for (int i=0;i<names2.length;i++){
            if(names2[i].length()==5){
                System.out.println(names2[i]);
            }

        }

        }



    }


