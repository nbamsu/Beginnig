package ObjectPractice;

import java.util.Scanner;

public class PhoneTest {
    public static void main(String []args){
        Phone ph=new Phone();
        ph.price=800;
        ph.screen="15'";
        ph.model="Iphone 10";
        ph.brand="Apple";
        ph.year=2016;
        ph.madeCountry="China";
        System.out.println("My Phone brand is: "+ph.brand);
        System.out.println("Model is: "+ph.model+"; Phone price is: "+ph.price +"$");
        System.out.println("It's made in: "+ph.madeCountry);


        ph.music();
        ph.voiceCall();
        ph.videoRecord();
        ph.videoCall();





    }
}
