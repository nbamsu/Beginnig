package HomeWork;

import java.util.Scanner;

public class CarSpeed {
    public static void main(String [] args){

        Scanner input=new Scanner(System.in);
        System.out.println("please enter current speed");
        int current=input.nextInt();
        System.out.println("please enter  target speed");
        int targetSpeed=input.nextInt();
        int time=0;
        int result=0;
        do{result=current+time*10;
            time++;
            System.out.println(time);
        }
        while(result<targetSpeed);
        System.out.print("it will take "+time+" second to reach target speed");





    }
}
