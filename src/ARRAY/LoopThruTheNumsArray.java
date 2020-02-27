package ARRAY;

import java.util.Arrays;

public class LoopThruTheNumsArray {
    public static void main(String[] args) {
        int  [] numbers={100,200,300,400};
        int sum=0;
        for(int i=0;i<numbers.length;i++){


            sum+=numbers[i];
            System.out.println("the sum "+sum);

        }
    }
}
