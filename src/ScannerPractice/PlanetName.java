package ScannerPractice;

import java.util.Scanner;

public class PlanetName {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Planet name  ");
        //String planetNam="Makameke";
        //System.out.println(planetNam);
        String planetName=input.next();
        System.out.println("first char "+planetName.charAt(0));
        System.out.println("Last char "+planetName.charAt(planetName.length()-1));
        System.out.println("Middle char "+planetName.charAt(planetName.length()-1)/2);
        System.out.println("first k "+ planetName.indexOf("k"));
        System.out.println("Second k "+planetName.indexOf("k",3));
        //makameke --
        /*
        1 -- find the index of first k --> planetName.indexOf("k")  ---> int 3

         */
           // mapkeleke --> planetNmae.indexOf("k")+1; 4
        // kaka ---> planetName.indexOf("k")+1
        System.out.println("First K "+planetName.indexOf("k"));
        System.out.println("Second K "+planetName.indexOf("k",planetName.length()));

        //System.out.println("10th char "+planetName.charAt(10)); // ----> runtime error
        //If there is an error it will not go and execute the line
        System.out.println("There is not 10th char");




    }
}
