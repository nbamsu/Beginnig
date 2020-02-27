package ConditionStatments;

public class IFstatementPractice {
    public static void main(String[] args) {
        int k = 4;
        if (k > 3) {
            k++;
            k++;
        }
        System.out.println(k);
         int t=4;
                 if(t>3)
                    t++;   // this line execution will always according to IF statement.
                    t++;   // This line will be executed every time
        System.out.println("T is "+t);


            int d=5;
            if (d > 7){ // false
                d++;
            d++; // inside curly braces will not executed
        }
         System.out.println("D is "+d);


            int x=5;
            int r=6;
            if(x<r)
                x++;  //--> executed -->6
                ++r;  // --> always executed -->7
                x--;  // --> always executed -->5
        System.out.println(x);
        System.out.println(r);







    }
}