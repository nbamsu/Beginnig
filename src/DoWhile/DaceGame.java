package DoWhile;

import java.util.Random;
import java.util.Scanner;

public class DaceGame {
    public static void main(String[] args) throws Exception {
        /*
        two dice 0-6
        get sum of this number
        play the game until your sum is equals to 2
         */
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        System.out.println("Do you wanna play? Y/N");
        String answer=input.next();
        int sum;
        int count=0;


          if (answer.equalsIgnoreCase("Y")){
              do{
                  System.out.println("Your dice is rolling...");
                  Thread.sleep(1000);
                  int dice=random.nextInt(7);
                  int dice2=random.nextInt(7);
                  if (dice==0){
                      dice++;
                  }
                  if(dice2==0){
                      dice2++;
                  }
                  System.out.println("Dice number 1 "+dice);
                  System.out.println("Dice number2 "+dice2);
                  sum=dice+dice2;
                  System.out.println("your sum is "+sum);
                  count++;
              }while (sum!=2);
              System.out.println("YOur total roll is "+count);
          }else{
              System.out.println("Have a great night");
          }

    }
}
