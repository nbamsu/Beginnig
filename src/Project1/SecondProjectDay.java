package Project1;

import java.util.Scanner;

public class SecondProjectDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the type of music: ");
        String musicType = input.nextLine(); // pop, classic


        if (musicType.equalsIgnoreCase("pop")) {
            System.out.println("Choose the soong from pop");
            String songName = input.nextLine(); // pop1, pop2, pop3
            if (songName.equalsIgnoreCase("pop1") || songName.equalsIgnoreCase("pop2") || songName.equalsIgnoreCase("pop3")) {
                System.out.println("Please enter the 2$ for " + songName);
            }
            else {
                System.out.println("incorrect1");
            }
        }
        /*else if (musicType.equalsIgnoreCase("classic")) {
            System.out.println("Choose the soong from classic");
            String songName = input.nextLine(); // classic1, classic2, classic3
            if (songName == "classic1" || songName == "classic2" || songName == "classic3") {
                System.out.println(songName);
            } else {
                System.out.println("TYPEOFF");
            }
        }*/
        else {
            System.out.println("TYPEOFMUSICisnotavailable");
        }
    }
}
