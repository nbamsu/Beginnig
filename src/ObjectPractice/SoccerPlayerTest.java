package ObjectPractice;

public class SoccerPlayerTest {

    public static void main(String[] args) {
        SoccerPlayer boo=new SoccerPlayer();
        boo.firstName="Kevin";
        boo.age=30;
        boo.gender='M';
        boo.position="Midfielder";
        boo.team="Manchester City";
        boo.totalDistance=11;

        System.out.println("The name of the player is "+boo.firstName+boo.age+boo.position);
        boo.pass();
        boo.run();
        int speed=boo.shoot();
        int shootDistance=25;
        if (speed>=20&&shootDistance<30){
            System.out.println("Its goal");
        }else{
            System.out.println("It's not goal");
        }
        SoccerPlayer player1=new SoccerPlayer();
        player1.firstName="Messi";
        player1.totalDistance=8;

        player1.run();  //---> it will reduce the totalDistance
        player1.shoot();
        player1.pass();
        boo.run();
        player1.run();

        player1.run();
        player1.run();
        player1.run();
        System.out.println("Messi total distance: "+player1.totalDistance);
        System.out.println("Kevin total distance; "+boo.totalDistance);







}
}

