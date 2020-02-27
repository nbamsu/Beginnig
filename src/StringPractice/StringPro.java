package StringPractice;

import java.util.regex.Pattern;

public class StringPro {
    public static void main(String[] args) {
        //Provide the string values, This string value needs to end with 'K'


        System.out.println( Pattern.matches(".k","ak"));
        System.out.println(Pattern.matches("[0-9]+","123453654"));
    }
}
