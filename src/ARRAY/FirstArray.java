package ARRAY;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class FirstArray {
    public static void main(String[] args) {
        int [] numbers=new int[4];
        numbers[0]=10;
        numbers[1]=35;
        numbers[2]=45;
        numbers[3]=30;
        //numbers[2]=100;  if you reassigning new value, system out will be last integer
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[0]+numbers[1]);

        for(int i=0;i<numbers.length;i++){ // difference between i++ and i+
            System.out.println("The numbers "+(i+1) +" is "+numbers[i]);
        }
    }
}
