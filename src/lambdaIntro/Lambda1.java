package lambdaIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda1 {
    public void perform(Greeter greeter){
        greeter.greeting();
    }
    public static void main(String [] args){
        Lambda1 lambda1=new Lambda1();
//        Greeter greeterImpl=new GreeterImpl();
//        lambda1.perform(greeterImpl);

        //Predicate
        //Consumer
        //Runnable
       Greeter myBlockCode=()-> System.out.println("Hello world");
        Great anotherBlock=(String id)->  12;

        List<String> list=new ArrayList();
        list.add("Hello");
        list.add("dad");
        list.add("Techtorial");
        list.add("car");
        list.add("bee");
        list.add("Throw");
        list.add("Mam");
//        for(String str:list){
//            System.out.println(str);
//        }
        list.forEach(element-> System.out.println(element));


    }


}
