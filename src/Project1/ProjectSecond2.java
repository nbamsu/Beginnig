package Project1;

import java.util.Scanner;

public class ProjectSecond2 {
        public static void main(String[] args) {
            // write your code here
            Scanner input = new Scanner(System.in);
            System.out.println("Please select the music types of Classical or Pop or Country");
            String selectedMusicType = input.nextLine();
            String classicalSongs= "Four Seasons, Fur Elise, Finlandia, Vocalisa, The planets";
            String popSong="Bad guy, Talk, Please Me, 7 Ring, Without me";
            String countrySongs="Meant to Be, Heaven, Simple, One nember Away, Get Along";
            int priceClassical=2;
            int pricePop=4;
            int priceCountry=3;
            // String selectedSong=input.nextLine();
            if (selectedMusicType.equalsIgnoreCase("Classical")) { // || selectedMusicType.equalsIgnoreCase("Pop") || selectedMusicType.equalsIgnoreCase("Country")) {
                System.out.println("These are the available songs : " + classicalSongs);
                System.out.println("Please select the music you want to listen");
                String songName = input.nextLine();
                if (classicalSongs.contains(songName)) {
                    System.out.println("Please pay $:" + priceClassical);
                    int payment = input.nextInt();
                    if (payment == priceClassical) {
                        System.out.println(songName + " is playing enjoy it!");
                    } else if (payment > priceClassical) {
                        System.out.println("Please wait for the change $"+ (payment - priceClassical));
                    } else {
                        System.out.println("Entered price is not enough please try later. Please add additional amount of $ "+ (priceClassical - payment));
                    }
                } else {
                    System.out.println(songName + "not available.");
                }
            } else if (selectedMusicType.equalsIgnoreCase("pop")){ // || selectedMusicType.equalsIgnoreCase("Pop") || selectedMusicType.equalsIgnoreCase("Country")) {
                System.out.println("These are the available songs : " + popSong);
                System.out.println("Please select the music you want to listen");
                String songName=input.nextLine();
                if (popSong.contains(songName)){
                    System.out.println("Please pay $:"+ pricePop);
                    int payment=input.nextInt();
                    if (payment==pricePop){
                        System.out.println(songName +" is playing enjoy it!");
                    }
                    else if (payment>pricePop){
                        System.out.println("Please wait for the change $"+ (payment-pricePop));
                    }
                    else{
                        System.out.println("Entered price is not enough please try later. Please add additional amount of $"+ (pricePop-payment));
                    }
                }else {
                    System.out.println(songName+ "not available."); }
            } else if (selectedMusicType.equalsIgnoreCase("country")) { // || selectedMusicType.equalsIgnoreCase("Pop") || selectedMusicType.equalsIgnoreCase("Country")) {
                System.out.println("These are the available songs : " + countrySongs);
                System.out.println("Please select the music you want to listen");
                String songName = input.nextLine();
                if (countrySongs.contains(songName)) {
                    System.out.println("Please pay :" + priceCountry);
                    int payment = input.nextInt();
                    if (payment == priceCountry) {
                        System.out.println(songName + " is playing enjoy it!");
                    } else if (payment > priceCountry) {
                        System.out.println("Please wait for the change $"+ (payment - priceCountry));
                    } else {
                        System.out.println("Entered price is not enough please try later. Please add additional amount of $"+ (priceCountry - payment));
                    }
                } else {
                    System.out.println(songName + "not available.");
                }
            }else {
                System.out.println(selectedMusicType+ "is not available ");
            }
        }
    }


