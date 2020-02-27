package ObjectPractice;

public class Cat {
    String name;
    int age;
    String color;
    boolean isRunning;
    String kind;
    int speed;
    public boolean start() {
        if (isRunning == false) {
            isRunning = true;
        }
        speed = 10;
        return isRunning;
    }
    public boolean stop() {
        isRunning = false;
        speed = 0;
        return isRunning;
    }

    public void displayInfo() {
        System.out.println("the name of cat is " + name);
        System.out.println("the cat age is " + age);
        System.out.println("is the cat is running " + isRunning);
        System.out.println("the cats collor is " + color);
        System.out.println("cats kind is " + kind);
        System.out.println("cats speed is " + speed);
    }
    public void acclerate(int targetSpeed) {
        if (speed<targetSpeed){
            int currentSpeed=speed;
            while(currentSpeed<=targetSpeed){
                System.out.print(currentSpeed+",");
                System.out.println();
                currentSpeed++;
            }
            speed=currentSpeed;
        }
    }
    public void run(){
        start();//speed 10, isRunning true
        System.out.println(name+" is running ");
    }
    public void run(String destination){
        start();
        System.out.println(name+"Is runnnig. " +
                "The destination is "+destination);
    }
    public void run(String destinotion,int totalDistance) {
        start();
        System.out.println(name + " is running. " +
                "Destination is  " + destinotion + "to total distance " + totalDistance + " Miles ");
    }
    public void run(int ...num){
        System.out.println("The first value is: "+num[0]);
        int indexNum=num.length-1;
        System.out.println("the last value is "+num[indexNum]);
    }

    }


