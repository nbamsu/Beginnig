package Abstraction;

public class TestClass {


    public static void main(String[] args) {
        //StudentClass st=new StudentClass() --> can bot be instantiate as Student class is Abstract class
        CampusStudent campusStudent=new CampusStudent();
        campusStudent.attendClass();

    }
}
