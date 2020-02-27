package Interface3;

public abstract class Phone implements HeadPhones,MemoryCard  {
    @Override
    public void playMusic(){
        System.out.println("Pressing play button");
    }
    @Override
    public void regularMethod(){
        System.out.println("Birnerse in abstract Phone");
    }





}
