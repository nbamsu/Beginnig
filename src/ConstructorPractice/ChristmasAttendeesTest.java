package ConstructorPractice;

public class ChristmasAttendeesTest {
    public static void main(String [] args){
        ChristmasAttendees first = new ChristmasAttendees("Katya","Keyboard");
        ChristmasAttendees second =  new ChristmasAttendees("John", "photo frame");
        ChristmasAttendees third = new ChristmasAttendees();


        third.name = "Alex";
        System.out.println(first.name+" " +first.giftName);
        System.out.println(second.name+" "+ second.giftName);
        first.giftExchange(first,second);
        System.out.println("--------------");


        System.out.println(first.name + " " + first.giftName);
        System.out.println(second.name + " "+ second.giftName);
        System.out.println("--------------");


        second.updateGift(first, "Clock");
        System.out.println(first.name + " "+first.giftName);
        third.giftExchange(third, second);
        System.out.println("----------------");


        System.out.println(second.name+ " " + second.giftName);
        System.out.println(third.name + " "+third.giftName);
    }
}
