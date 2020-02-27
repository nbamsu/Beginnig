package ForLoopFirstPractice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class CarOilChangeAndFuel {
    public static void main(String []args){
        Scanner inpt=new Scanner(System.in);
        System.out.println("Enter total miles");
        int mil=inpt.nextInt();
        for(int oil=1;oil<mil;oil+=2000){
            System.out.println("Oil change ");
            for(int gas=0;gas<2000;gas+=500){
                System.out.println("Fuel the gas");

            }
        }
    }
}
