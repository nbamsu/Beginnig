package ConstructorPractice;

public class ChristmasAttendees {
    String name;
    String giftName;
    // Constructors
    public ChristmasAttendees(){
    }
    public ChristmasAttendees(String name, String giftName){
        this.name = name;
        this.giftName = giftName;
    }
    // Methods
    public static void giftExchange(ChristmasAttendees first, ChristmasAttendees second){
        if(first.giftName!=null && second.giftName !=null){
            String temp = first.giftName;
            first.giftName = second.giftName;
            second.giftName = temp;
        }
    }
    public void updateGift(ChristmasAttendees person, String newGift){
        person.giftName = newGift;
    }
}

