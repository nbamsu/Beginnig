package Interface3;

public class MobilePhone extends Phone{

    @Override
    public String storeFiles() {
        return "Storing files from Phone to MemoryCard";
    }
    @Override
    public void playMusic(){
        System.out.println("Playing music from MobilePhone");
    }
    @Override
    public void regularMethod(){
        System.out.println("Birnerse in Mobile phone teper'");
    }

}
