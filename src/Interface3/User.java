package Interface3;

public class User extends Iphone {
    @Override
    public void playMusic(){
        System.out.println("Playing music from User class");
    }
     @Override
    public Object storeFiles() {
        return "Iphone is storing files in Icloud";
    }
    public static void main(String[] args) {
        MobilePhone mobilePhone=new MobilePhone();
        // mobilePhone will have variables nad method of MemoryCard, HeadPhones, Phone

//        HeadPhones headPhones=new MobilePhone();
//        //reference side Phone --> Object side MobilePhone
//        Phone phone=new MobilePhone();
//        phone.playMusic();
//        HeadPhones headPhones1=new User();
//        headPhones1.playMusic();
//        ((MobilePhone)headPhones).storeFiles();
//        ((MobilePhone)headPhones).regularMethod();
        Phone phone=new User();
        phone.regularMethod();
        ((Iphone)phone).faceID();
        System.out.println(phone.storeFiles());

    }

}
