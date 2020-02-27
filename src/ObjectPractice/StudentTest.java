package ObjectPractice;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class StudentTest {

    public static void main(String[] args) {

        Student st1=new Student();
        st1.firstName="Baha";
        st1.lastName="Nurkulov";
        st1.age=15;
        st1.gender='M';
        st1.nationality="Boro-Boro";
        st1.totalPage=250;
        System.out.println("My name is: "+st1.firstName);
        System.out.println("My last name is: "+st1.lastName);
        System.out.println("My age is: "+st1.age +", My Gender is: "+st1.gender);

        st1.study("Monday");
        st1.study("Thursday");
        st1.read();
        st1.studyTime();
        st1.read();
        st1.read();
        st1.read();
        st1.read();
        st1.read();
        System.out.println(st1.totalPage);



    }


}
