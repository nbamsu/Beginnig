package ScannerPractice;

public class loweUpperCaase {
    public static void main(String[] args) {
        String success="doing whatever it take";
        //success.toUpperCase();
        //success=success.toUpperCase();
        success.toLowerCase();
        success=success.toLowerCase();
        System.out.println(success);

        System.out.println(success.startsWith("d"));
        // If one letter does not math, result will be false
        //---> it depends what is it - lowerCase or UpperCase

        System.out.println(success.startsWith("takes")); //---> it will return true, becouse success is ending with "takes"


        System.out.println(success.contains("it"));


        System.out.println(success.equals("doing whatever it take"));

        String multiply="multiple";
        System.out.println(multiply.equals("multiple"));
        //String str="doingwhateverittakes";

        success.substring(6);
        System.out.println(success.substring(6));// it will print from 6th letter

        System.out.println(success); // it will print whole sentence

        System.out.println(success.substring(6,14));//6,7,8,9,10,11,12,13,



    }
}
