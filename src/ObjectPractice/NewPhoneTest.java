package ObjectPractice;

import java.util.Scanner;

public class NewPhoneTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        NewPhone phone=new NewPhone();
        phone.brandName="Apple";
        System.out.println("Welcome to our Contact list");
        System.out.println("Please enter your name");
       String name=input.next();
       phone.personName=name;
        System.out.println("Please enter your passcode");
        String passcode=input.next();
        phone.userPasscode=passcode;
         phone.contactList=new String[10];
        phone.phoneNumbers=new String[10];
        phone.islogin=false;
        int exit=0;
        do {
            phone.getInstraction();
            System.out.println("Please enter your choise");
            int myOption=input.nextInt();
            switch (myOption){
                case 1:
                    System.out.println("Please enter your passcode");
                    String code=input.next();
                    phone.login(code);
                    break;
                case 2:
                    phone.displayContact();
                case 3:
                    System.out.println("Add new contact name");
                    String addNewContactName=input.next();
                    System.out.println("Please enter number");
                    String addNewNumber=input.next();
                    phone.addNewContact(addNewContactName,addNewNumber);
                    break;
                case 4:
                    System.out.println("Please enter old  name to update");
                    String oldName=input.next();
                    System.out.println("Please entem new name ");
                    String newName=input.next();
                    phone.updateName(oldName,newName);
                    break;
                case 5:
                    System.out.println("Please enter old phone number");
                    String oldPhone=input.next();
                    System.out.println("Please enter new phone number");
                    String newPhone=input.next();
                    phone.updatePhone(oldPhone,newPhone);
                    break;
                case 6:
                    System.out.println("Please enter the name to remove from contact list");
                    String removedName=input.next();
                    phone.removeContact(removedName);
                    break;
                case 7:
                    System.out.println("Please enter your phone number");
                    String phone1=input.next();
                    System.out.println(phone.searchPhone(phone1));
                    break;
                case 8:
                    System.out.println("Please enter name to search phone");
                    String searchName=input.next();
                    System.out.println(phone.searchName(searchName));
                    break;
                case 9:
                    exit=9;
                    break;




            }

        }while(exit!=9);
        System.out.println("Thank you for using our phone");


        /*phone.brandName="Apple";
        phone.personName="Baha";
        phone.userPasscode="1234";
        phone.contactList=new String[10];
        phone.phoneNumbers=new String[10];
        phone.islogin=false;*/

    }
}
