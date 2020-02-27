package HomeWork;

import java.util.Scanner;

public class EggPerDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter number eggs");
        int egg = input.nextInt();
        int result =0;
        int eggLeft=egg-result;
        int eggEat=0;
        while (egg >result) {
            System.out.println("How many eggs you have eaten today?");
            eggEat = input.nextInt();
            result += eggEat;
            eggLeft=egg-result;
            if(result<=egg){ System.out.println("In the box " + eggLeft + " eggs left");}
            else if(egg<result){
                System.out.println("you don't have enough eggs");}
        }



    }
}