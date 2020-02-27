package ARRAY;

public class StringPractice {
    public static void main(String[] args) {
        String name="Techtorial"; //pool
        String name1="Techtorial";//pool
        String name2=new String("techtorial");// this is stored in heap

        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
           // == method is object will compare the value is  stored to the same location or ot
        // If the values stored same location it will return true
        //otherwise it will return false
        System.out.println(name==name1);
        System.out.println(name==name2);
    }
}
