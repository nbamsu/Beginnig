package ObjectPractice;

import sun.font.DelegatingShape;

public class SoccerPlayer {
    String firstName;
    int age;
    char gender;
    String position;
    String team;
    int totalDistance;
    public void run(){
        System.out.println(firstName+" running");
        if (totalDistance >= 3) {
            totalDistance=totalDistance-3;
            //totalDistance--; optional for use
        }else if (totalDistance<3&&totalDistance>0){
            System.out.println(firstName+" is running slowly");
            totalDistance--;
        }else{
            System.out.println(firstName+" can not play anymore");
        }

    }
    public int shoot(){
        int shoot=95;
        System.out.println("Shooting speed is: "+shoot+" mph");
        return shoot;
    }
    public void pass(){
        System.out.println("Soccer player giving pass");
    }






}
