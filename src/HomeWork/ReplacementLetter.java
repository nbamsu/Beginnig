package HomeWork;

public class ReplacementLetter {
    public static void main(String[] args) {


    //trim, toUpperCase, substring and charAt methods
     String str="Snicker";
       str=str.toUpperCase().trim().substring(0,7);
        System.out.printf("Value of str "+ str  +"");


        String str2="Coockie";
        str2=str2.toLowerCase().replace('o','u').concat("s");
        System.out.printf(  str2  );
}}
