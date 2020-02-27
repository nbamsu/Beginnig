package Pirmitives;

public class Coins {

    public static void mai(String [] args){

    /*
    givew value from 1 -- 99
    calculet how many quaters, nickles, pennies
    quaters=25
    dimes=10
    nickles=5
    pennies=1
     */
    int value=98;
    // 98 / 25=3
    // 98 % 25=23
    // 25+25+25+23

    int quarters=value/25; //3//
    int quarterReminder=value%25; //3//
    int dimes=quarterReminder/10; //2 dimes//
    int dimesReminder=quarterReminder%10; //23%10=3//
    int nickles=dimesReminder/5; //0
    int nickleReminder=dimesReminder%5; //3
    int pennies=nickleReminder/1; //3
    int penniesReminder=nickleReminder%1; //

        System.out.println("The value is "+value );
        System.out.println("Quarter is" +quarters);
        System.out.println("Dimes is " +dimes);
        System.out.println("Nickle is "+nickles);
        System.out.println("Pennies is "+pennies);

    }

}
