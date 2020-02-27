package ConstructorPractice;

import ClassMentoring.Array;

import java.beans.Transient;
import java.util.Arrays;

public class Phone {
    String phoneBrand;
    int cost;
    boolean camera;
    String carrier;
    public Phone(String phoneBrand){
        this.phoneBrand=phoneBrand;
    }
    public Phone(String phoneBrand,int cost){
        this.phoneBrand=phoneBrand;
        this.cost=cost;
    }
    public Phone(String phoneBrand,int cost,String carrier){
        this.phoneBrand=phoneBrand;
        this.cost=cost;
        this.carrier=carrier;
    }
    public Phone(String phoneBrand,int cost,boolean camera,String carrier){
        this.phoneBrand=phoneBrand;
        this.cost=cost;
        this.carrier=carrier;
        this.camera=camera;

    }
    public String findCheaperPhone(Phone phone1, Phone phone2)
    {
        if (phone1.cost>phone2.cost){
            return phone2.phoneBrand;
        }
        else if (phone2.cost>phone1.cost) {
            return phone1.phoneBrand;
        }
        else {return "";}
    }public String[] getPhoneDetails(Phone phone){
        if (phone.cost!=0&&phone.phoneBrand!=null){
            String str=phone.camera+"";
            String [] detailsOfPhone={phone.phoneBrand,""+phone.cost,str,phone.carrier};
            return detailsOfPhone;}
        String [] detailsOfPhone={"","","",""};
        return detailsOfPhone;}}
class Main {
    public static void main(String[] args) {
        Phone phone1=new Phone  ("iphone ", 345, true, "Verizon");
        Phone phone2=new Phone  ("Samsung", 325, true, "T-Mobile");
        phone1.findCheaperPhone(phone1,phone2);
        Phone phone = new Phone("iphone ", 345, true, "At&T");
        System.out.println(Arrays.toString(  phone.getPhoneDetails(phone1)));
        System.out.println(Arrays.toString(phone.getPhoneDetails(phone2)));
        System.out.println(Arrays.toString(phone.getPhoneDetails(phone)));
    }



   /*public static void findCheaperPhone(Phone phone1, Phone phone2){
        phone1.phoneBrand="Apple";
        phone1.cost=1000;
        phone1.camera=true;
        phone1.carrier="Verizon";

        phone2.phoneBrand="Samsung";
        phone2.cost=950;
        phone2.camera=false;
        phone2.carrier="At&t";
      //  if (phone1.cost>phone2.cost){
            System.out.println(phone1.camera);

        //}else{

        }*/





/*
Create a method that will accept Phone object and will return details of phone as an array. See below:

Method Name: getPhoneDetails(Phone phone)

[Iphone,  1000, true, Verizon]
[Samsung,  1200, false, AT&T]

*Make sure you have same method names as mentioned above.

Then click on Submit button and make sure all test cases are passed. Thanks!
 */
    }



