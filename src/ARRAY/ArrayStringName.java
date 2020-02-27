package ARRAY;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStringName {
    public static void main(String[] args) {
        String [] name= new String [6];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 6 value names");
        String Name=input.nextLine();

        /*name[0]=input.nextLine();
        name[1]=input.nextLine();
        name[2]=input.nextLine();
        name[3]=input.nextLine();
        name[4]=input.nextLine();
        name[5]=input.nextLine();*/
        for(int i=0;i<name.length;i++){
            name[i]=input.nextLine();
        }
        System.out.println(Arrays.toString(name));
    }
}
