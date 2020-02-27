package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        try {
            BufferedReader read = new BufferedReader(new FileReader("D:\\murasClub\\Zaro to Hero\\src\\Exception\\file.txt"));
            System.out.println(read.readLine());
            System.out.println(read.readLine());
            System.out.println(read.readLine());//IOException --> InputOutputException
        }catch(FileNotFoundException e){        // Input --> reading
            System.out.println(e.getMessage()); // Output--> writing
        }catch(IOException e){
            System.out.println("No such line");
        }
        }
}
