package TernaryPractice;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

public class TerneryPractice {
    public static void main(String[] args) {
        int space=6;
        int passenger=6;
        System.out.println(space>=passenger ? space-passenger : "They can not fit in the bus");
       // java doesn't know until runtime which one will executed.
        //That's why, if you are assigning both data types must be the same
        int result=space>=passenger ? space-passenger : space+passenger;
        System.out.println(space==passenger ?passenger--:space++);
        System.out.println(passenger); //5 execution
        System.out.println(space);//6
        String str=10>6?"Hello":"Java";
        System.out.println(str);

        int num=10>6?10:10;
        System.out.println(num);
        String str1=6>4?"Hello" : "Java";
        System.out.println(str1);
        //String str1=6>4?"Hello:11; ---> It will compile time error

    }

}
