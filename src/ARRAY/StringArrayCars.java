package ARRAY;

import java.util.Arrays;

public class StringArrayCars {
    public static void main(String[] args) {
        String [] cars=new String [5];
        cars [0]="BMW";
        cars[1]="Mazda";
        cars[2]="Mercedes";
        cars[3]="Honda";
        cars[4]="Tesla";
        //cars [10]="Tesla"; --> it is runtime error( outofboundsException)
        // if element value is equals to Honda print the value.
        //equalIgnorCase() method
        for (int i=0;i<cars.length;i++){
            if (cars[i].equalsIgnoreCase("honda"))
            System.out.println("The car name is "+cars[i]);
        }
        int  [] numbers={100,200,300,400};
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(cars));



    }
}
