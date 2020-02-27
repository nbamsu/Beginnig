package Pirmitives;

public class Square1 {
    public static void main(String[] args) {
        int totalSalary = 500000;
        int FiftyPercentSalary = 100000;
        int thirtyPercentSalary = 60000;
        int twentyPercentSalary = 40000;
        System.out.println("Need to add bonuses");
        int fivePercent, eightPercent, tenPercent;
        fivePercent = 5000;
        eightPercent = 4800;
        tenPercent = 4000;
        fivePercent += FiftyPercentSalary;
        eightPercent += thirtyPercentSalary;
        tenPercent += twentyPercentSalary;
        System.out.println("This is total with 5 percent bonus $" + fivePercent);
        System.out.println("This is total with 8 percent bonus$" + eightPercent);
        System.out.println("This is total with 10 percent bonus" + tenPercent);

    }

    }

