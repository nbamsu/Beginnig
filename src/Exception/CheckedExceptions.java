package Exception;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
        } catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }
        try {
            Thread.sleep(-5000);
            System.out.println("Wake up");
        }catch(InterruptedException e){
            System.out.println("In catch block");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        }

}
