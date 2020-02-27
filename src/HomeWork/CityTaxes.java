package HomeWork;



import java.util.Scanner;

public class CityTaxes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the city ");
        String cityName = input.nextLine();
        cityName = cityName.toUpperCase();
        System.out.println("Enter spending amount $");
        int totalPrice = input.nextInt();
        double taxAmount=0;


        switch (cityName) {
            case ("CHICAGO"):
                if (totalPrice <1000) {
                    taxAmount = totalPrice * 5 / 100;
                    System.out.println("Your spending total amount with tax $" + (taxAmount+totalPrice));
                    break;
                }


                 if (totalPrice>1000){
                     taxAmount=totalPrice*10/100;
                    System.out.println("Total spending with taxes$ "+(totalPrice+taxAmount));
                    break;
                }
            case("NEW YORK"):
                if (totalPrice>2000) {
                    taxAmount= totalPrice * 7 / 100;
                    System.out.println("total spending amount with taxes$ " + (totalPrice+taxAmount));

                }
                    if (totalPrice<1000 && totalPrice>500) {
                        taxAmount = totalPrice * 9 / 100;
                        System.out.println("Total spending amount with taxes$ " + (taxAmount + totalPrice));

                    }
                        if (totalPrice<500) {
                            taxAmount = totalPrice * 11 / 100;
                            System.out.println("Total spending amount taxes$ " + (taxAmount + totalPrice));

                        } case("LOS ANGELES"):


                        if (totalPrice>15000) {
                            taxAmount = totalPrice * 4 / 100;
                            System.out.println("Total spending amount with taxes$ " + (taxAmount + totalPrice));


                        }
                        if (totalPrice<15000&&totalPrice>5000){
                            taxAmount=totalPrice*6/100;
                            System.out.println("Total spending amount with taxes$ "+(taxAmount+totalPrice));

                        }
                        if (totalPrice<5000){
                            taxAmount=totalPrice*8/100;
                            System.out.println("Total spending amount with taxes$ "+(taxAmount+totalPrice));
                        }
            }

                }


    }








