package StringPractice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class MethodChaPracticeining {
    public static void main(String[] args) {
       /* String str=" Zero to Hero ";
        str=str.replace("Zero","one").toUpperCase().trim().substring(0,3);
        System.out.println("Value of str is "+str);


        String name=" Applications ";
       int index= name.toLowerCase().trim().indexOf("t");
        // you will decide return type according last method
        System.out.println(index);

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first input with following format: 9.14% of 26.3 ");
        String one=input.nextLine();
        System.out.println("Please enter the first input with following format: 9.14-26.3 ");
        String two=input.nextLine();

        one=one.replace("%","").replace("of","-");
        System.out.println("Both String value is matching? "+one.equals(two) );*/


        Scanner input = new Scanner(System.in);
        System.out.println("Please put First and Last name: ");
        String name = input.nextLine();
        char firstLetter = name.charAt(0);
        int indexNumber = name.indexOf(" ") + 1;
        char lastNameLetter = name.charAt(indexNumber);
        System.out.println("first letter " + firstLetter + " last name first letter " + lastNameLetter);

        String actualFirstLetter = "" + firstLetter;
        String actualLastNmeLetter = "" + lastNameLetter;

        String expectedFirstLetter = actualFirstLetter.toUpperCase();
        String expectedLastNameLetter = actualLastNmeLetter.toUpperCase();

        boolean result = actualFirstLetter.equals(actualFirstLetter) && actualLastNmeLetter.equals(expectedLastNameLetter);

        System.out.println("They are starting with upper cases or not?" + result);
    }
}