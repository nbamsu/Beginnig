package ScannerPractice;

public class StringMethod {
    public static void main(String [] args){
        String bookName="Potantial";
        bookName=bookName.concat(" of the class");
        System.out.println(bookName);


        String soccerPlayer=(" Cristiano ");
        soccerPlayer.concat("Ronaldo"); // there is no reassignment for last name
        //SoccerPlayer will be still Cristiano. String is immutable
        soccerPlayer=soccerPlayer.concat( " Ronaldo ");

        System.out.println(soccerPlayer);



        String computer="Macbook Computer";
        //System.out.println(computer.indexOf("b"));// index number of "b" -3

        System.out.println(computer.indexOf("ok")); // 3
        System.out.println(computer.indexOf("t")); // if there is no String value in String, it will return "-1"
        System.out.println(computer.indexOf("o")); //if there are more then one matching value, it will return index number for first matching
        System.out.println(computer.indexOf( "o",7));


        System.out.println(computer.indexOf( "b",3));
       //from Index means it will giving index number
    }
}
