package StringPractice;

import javax.sound.midi.Soundbank;

public class declaredtring {

    public static void main(String [] args){
        String name = "Techtorial";  // ---> initializing the variables.

        //String name  ---> declaring variables

        // Variables inside the main method is called variables
        // local variables will not take default value.


        String six="6";
        String five="5";
        System.out.println(six + five);  // 65

        six+=five;  //six = 65
        six=six+five; // "65"+"5"=655

        System.out.println(six);
        System.out.println(five);

    }
}
