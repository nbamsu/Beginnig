package ObjectPractice;

public class CatTest {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.speed=0;
        cat.color="White";
        cat.kind="Scottish";
        cat.age=3;
        cat.name="Dodo";
        cat.start();
        cat.displayInfo();
        cat.stop();  // isRunning now is true
        cat.displayInfo();
        cat.start();
        // If cat is start running  speed is 10;
        //Create one method to accelerate to speed.
        // this method will take one parameter as a target speed.
        // 10-20
        // it will print  number ten to twenty
        // 10,11,12,13,14----20
        cat.acclerate(20);
        cat.acclerate(30);
        //cat.run();
        Cat cat1=new Cat();
        cat1.speed=0;
        cat1.color="Black";
        cat1.kind="Scottish";
        cat1.age=3;
        cat1.name="Princess";
        cat1.run("Shaumburg",10);
        cat1.displayInfo();
        cat1.run(4,5,4,5,4,5,7,8,98888);


    }

    }

