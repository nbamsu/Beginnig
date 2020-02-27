package Pirmitives;

public class FiveDigitsValue {
    public static void main(String [] args){
        //enter any five digit number
        //56789
        // print number reversed 98765
        /*
        5
        6
        7
        8
        9
          */
        //print sum of the numbers
        int number=56789;
        int first=number%10; //9
        number=number/10; //5678

        int second=number%10; // 8
        number=number/10; //567

        int third=number%10; // 7
        number=number/10; // 56

        int fourth=number%10; //6
        number=number/10; //

        int fifth=number%10;
        number=number/10;
        String reversNumber=""+first+second+third+fourth+fifth;
        System.out.println(reversNumber);
        System.out.println(""+first+"\n"+second+"\n"+third+"\n"+fourth+"\n"+fifth);
        int sum=first+second+third+fourth+fifth;
        System.err.println(sum);
    }
}
