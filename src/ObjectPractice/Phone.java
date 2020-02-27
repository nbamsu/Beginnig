package ObjectPractice;

public class Phone {
    double price;
    String screen;
    String model;
    String brand;
    int year;
    String madeCountry;

    public void voiceCall(){
        System.out.println("Voice call is in action");
    }
    public double videoCall(){
        double pricePerMinute=5;
        System.out.println("Video call is in action, it cost "+pricePerMinute+"$ per minute");
        return pricePerMinute;
    }
    public String music(){
        String nameOfMusic="Dance for me";
        System.out.println("Music is playing: "+nameOfMusic);
        return nameOfMusic;
    }
    public void videoRecord(){
        System.out.println("Video start recording");
    }
}
