package ArithmeticOperators;

public class Example1 {
    public static void main(String [] args){
        boolean isJavaFun = false;
        System.out.println(!isJavaFun);
                           //true and true
        System.out.println(true && true);   //--> True
        System.out.println( true && false);    // printing only TRUE condition //&& checking both side for "and--.and'
        System.out.println(false && false);//-->False
    System.out.println(false && true); //--> false
        System.out.println(true && true && true && false); //---> False

        System.out.println(true || true);    // "||" mean OR +
        System.out.print(false|| false|| false|| true); //---> True   // if there True word its going to be always TRUE




    }




}
