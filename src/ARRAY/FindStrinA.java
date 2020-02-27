package ARRAY;

import javax.swing.*;

public class FindStrinA {
    public static void main(String[] args) {


String [] names={"Aiturgan","Aizhana","Aizharkyn","Dmitry","Erma","Jamilya"};

for(String name:names){
    if (name.length()>5&&name.startsWith("A")){
        System.out.println(name);
    }
}

}

}

