package ArithmeticOperators;

import AccessModifier.ModifierPractice;

public class Aroperators {
    public static void main(String [] args){
        int currentSpeed = 45;
        int speedLimit = 30;
                                // 45 < 30 --->false
        boolean increaseSpeed = currentSpeed<speedLimit;
        System.out.println(increaseSpeed);
                         //45 > 30 --> true
boolean decreaseSpeed = currentSpeed > speedLimit;
System.out.println("Increase your speed: "+increaseSpeed);
        System.out.println("decrease your speed: "+decreaseSpeed);






    }




}
