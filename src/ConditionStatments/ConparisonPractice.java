package ConditionStatments;

public class ConparisonPractice {
    public static void main(String [] args){

        int currentSoeed=50;
        int speedLimit=70;
        boolean increaseSpeed=currentSoeed<speedLimit;
        boolean decreaseSpeed=currentSoeed>speedLimit;
        System.out.println("Can I increase the speed? "+increaseSpeed);
        System.out.println("Should I decrease the speed? "+decreaseSpeed);


        //TASK
        /*
        Room temperature 75
        Roome expectedTemp= 72;


         */

    int roomTemp=75;
    int expectedTemp=72;
            boolean increaseTemp= roomTemp< expectedTemp;
            boolean decreaseTemp= roomTemp>expectedTemp;
        System.out.println("Increase temp "+increaseSpeed);
        System.out.println("Decrese temp "+decreaseSpeed);

        //write once and run everywhere

    }
}
