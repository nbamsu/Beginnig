package ClassMentoring;

import ConstructorPractice.Student;

import java.util.ArrayList;
import java.util.List;

public class CreatingAnObject {
    String name;
    String lastName;
    int age;
    char gender;

    public CreatingAnObject(String name, String lastName, int age, char gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        List<CreatingAnObject> st1=new ArrayList();
     CreatingAnObject st=new CreatingAnObject("Baha","Nur",29,'F');
     st1.add(new CreatingAnObject("Baha","Nurkulove",79,'F'));
     st1.add(new CreatingAnObject("Bah","Nurkulov",209,'U'));
     st1.add(new CreatingAnObject("Ba","Nurkul",89,'Q'));
     st1.add(new CreatingAnObject("B","Nurku",30,'U'));
     for (int i=0;i<st1.size();i++){
         System.out.print(st1.get(i).lastName+" ");
         //System.out.println(" ");

         System.out.print(st1.get(i).gender+" ");
     }
     //System.out.println(st1.size());
    }
}
