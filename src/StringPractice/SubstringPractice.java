package StringPractice;


public class SubstringPractice {
    public static void main(String[] args){
        String comComponent="keyboard";
        System.out.println(comComponent.substring(3));
        System.out.println(comComponent.substring(3,5));  //3,4
        System.out.println(comComponent.substring(1,2)); // print only "E"
        System.out.println(comComponent.substring(2,2));// it will print empty result
       // System.out.println(comComponent.substring(4,2)); // it will throws the exception
        //System.out.println(comComponent.substring(4,20));
        System.out.println(comComponent.substring(4,8)); //4,5,6,7 ---> oard





    }
}