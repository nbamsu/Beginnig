package ForLoopFirstPractice;


import java.util.Scanner;

public class InfiniteForLoop {
    public static void main(String[] args) {
        int i=0;
        for(;i<10;i++){
            System.out.println("Strar");// it will infinite loop
            i++;
        }


        Scanner input=new Scanner(System.in);
        String str2=input.nextLine();
        char letter='a';
        char leeter='A';
        for(int i2=0;i2<str2.length();i2++){
            if(str2.charAt(i2)=='a'|| str2.charAt(i2)=='A'){
                System.out.println(str2.charAt(i2));
                //System.out.println("The char is "+str2.charAt(i2));
               // System.out.println("The index of number is "+i2);
            }

        }


    }
}
