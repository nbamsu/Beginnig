package ARRAY;

import java.util.Arrays;

public class SplitString {
    public static void main(String [] args){
        String date="12-7-2011-12:45";
        String []vales=date.split("-");
        System.out.println(Arrays.toString(vales));
        if (vales[2].equalsIgnoreCase("2019")) {
            System.out.println("The year is 2019");

        }else{
            System.out.println("The year is not 2019");
        }
    }
}
