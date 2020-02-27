package SetCollaction;

import java.util.HashSet;
import java.util.Set;

public class FlowersTest {
    public static void main(String[] args) {
    Flowers fl=new Flowers("Begonia","Brown");
    Flowers fl1=new Flowers("Bee Balm","Blue");
    Flowers fl2=new Flowers("Butter Cup","Yellow");
    Flowers fl3=new Flowers("Rose","Red");
    Flowers fl4=new Flowers("Tulip","Pink");
    Flowers fl5= new Flowers("Pions","White");
    Set<Flowers> tr=new HashSet<>();
    tr.add(fl);
    tr.add(fl1);
    tr.add(fl2);
    tr.add(fl3);
    tr.add(fl4);
    tr.add(fl5);
    for (Flowers i:tr){
        //System.out.println(i.name.toString()+" "+i.color.toString());
        System.out.println(i.toString());
        System.out.println();
    }
       // Every System.out.println(); calls toString method().
        //If the class has not toString method, toString method will come frome object class
        //We are creating the toString method in this class to be able print all our instance variables in any format which we created
        // Print all the object color if object name is starting with "B"
        for (Flowers tr2:tr){
            if (tr2.name.startsWith("B")){
                System.out.println(tr2.name+" This is all flowers start with");
            }
        }

        int result= Flowers.numbers("mamfha13ha34afw897");
        System.out.println(result);


    }
}
