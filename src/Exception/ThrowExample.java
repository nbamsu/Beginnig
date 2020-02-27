package Exception;

public class ThrowExample {
    public static void main(String[] args) {

        try {
            System.out.println("About to throw an Exception");
            throw new RuntimeException();
            //System.out.println("In try block after exception");
        }catch(Exception e){
            System.out.println("In catch block");
        }finally{
            System.out.println("Done with Exception");
        }
        }
}
