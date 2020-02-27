package Pirmitives;

public class OperatorPrecedence {
public static void main( String [] args){
    // *, / and % will be executed befor +, -

    int calculate=10+3/8; //3/8=0 --> 10+0=10
    System.out.println(calculate);


    double decimalNumber=9/5d;

    System.out.println(decimalNumber);


}

}
