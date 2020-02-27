package Pirmitives;

public class Farm {
    public static void main(String [] args){

        byte chicken=44;
        byte cows= 23;
        int total=chicken+cows;
System.out.println("total of animal " + total);


        int cowLegs=23*4;
        int chickenLegs=44*2;
        int totalNumberOfLegs=cowLegs+chickenLegs;

        System.out.println("this is total legs in farm " +totalNumberOfLegs);


        int chicken$=55;
        int cow$=2000;
        int totalAnimalPrice=(cows*cow$)+(chicken*chicken$);
        System.out.print("Total animal price "+totalAnimalPrice);

    }
}
