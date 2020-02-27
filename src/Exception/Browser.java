package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Browser {
    public static void wait(int second){
        try {
            Thread.sleep(second * 1000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        }
        public static void readFile(String fileName) throws IOException {
        String path="D:\\murasClub\\Zaro to Hero\\src\\Exception\\" +fileName+".txt";
            BufferedReader reader=new BufferedReader(new FileReader(path));
            System.out.println(reader.readLine());
        }

    public static void main(String[] args) throws IOException {
        Browser browser=new Browser();
        browser.wait(5);
        System.out.println("Waited 5 second ");
        browser.readFile("invalied");
    }//file2.txt

}
