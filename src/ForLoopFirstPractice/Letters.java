package ForLoopFirstPractice;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str="Makameke";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'||str.charAt(i)=='k'){
                continue;
            }
            System.out.println(str.charAt(i));
        }
    }
}
