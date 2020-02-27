package ObjectPractice;

public class NewPhone {
    String brandName;
    String personName;
    String userPasscode;
    String []contactList;
    String [] phoneNumbers;
    Boolean islogin;
    public void displayContact(){
        for (int i=0;i<contactList.length;i++){
            System.out.println(contactList[i]+" --> "+phoneNumbers[i]);
        }
    }
    public boolean addNewContact(String name,String phoneNumber){
        boolean isAdded=false;
        for (int i=0;i<contactList.length;i++){
            if (contactList[i]==null){
                contactList[i]=name;
                phoneNumbers[i]=phoneNumber;
                isAdded=true;
                break;
            }
        }
        return isAdded;
    }
    public void updateName(String oldName,String newName){

        for (int i=0;i<contactList.length;i++){
            if (contactList[i].equals(oldName)){
                contactList[i]=newName;
                break;
            }

        }

    }
    public void updatePhone(String oldPhone,String newPhone){
        for (int i=0;i<phoneNumbers.length;i++){
            if (phoneNumbers[i].equals(oldPhone)){
                phoneNumbers[i]=newPhone;
                break;
            }
        }

    }
    public boolean removeContact(String name){
        for (int i=0;i<contactList.length;i++){
            if (contactList[i]==null){
                continue;
            }
            if (contactList[i].equals(name)){
                contactList[i]=null;
                phoneNumbers[i]=null;
                return true;
            }
        }
        return false;

    }
    public String searchPhone(String phoneNumber){
        for (int i=0;i<phoneNumbers.length;i++){
            if (phoneNumbers[i].equals(phoneNumber)){
                return contactList[i];
            }
        }
        return null;
    }
    public String searchName(String name){
        for (int i=0;i<contactList.length;i++){
            if (contactList[i].equals(name)){
                return phoneNumbers[i];
            }
        }
        return null;
    }
    public boolean login(String passcode){
        if(this.userPasscode.equals(passcode)){
            System.out.println("Welcome to "+brandName);
            islogin=true;
            return islogin;
        }
        return islogin;
    }

    public void getInstraction() {
        System.out.println("To be able t Log in press 1");
        System.out.println("To be able to Print list of contact press 2");
        System.out.println("To be able to add new contact press 3");
        System.out.println("To be able to update existing contact name press 4");
        System.out.println("To be able to update phone number press 5");
        System.out.println("To be able to remove contact press 6");
        System.out.println("To be able to search with phone number press 7");
        System.out.println("To be able to search with name press 8");
        System.out.println("To exit press 9");

    }

}
