package HomeWork;

public class BobSalary {
    public static void main(String[] args) {
        int salary=200000;
        int bonus1=salary/50*5/100;
                     //System.out.println(bonus1);
        int bonus2=salary*30/100*8/100;
        int bonus3=salary*20/100*10/100;
        System.out.println("Bob is making "+(bonus1+bonus2+bonus3)+" dollars as a bonus");

    }

}
