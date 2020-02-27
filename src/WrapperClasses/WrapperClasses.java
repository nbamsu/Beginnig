package WrapperClasses;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class WrapperClasses {
    public static void main(String[] args) {
        //int ->Integer
        //double --> Double
        Integer num1= new Integer("22");
        int num1prm=num1;
        num1prm=num1prm+5;
        System.out.println(num1prm);
        Integer num2=Integer.valueOf("101");

        int num2prm=num2;// Unboxing

        int myNum=1;
    Integer myNumWrap=myNum;// Autoboxing

        Double double1=Double.valueOf("4.5");
        double double1prm=double1;
        System.out.println(double1);

        Boolean b1=Boolean.valueOf("true");//we can print this, return will bw lower case false!
        boolean b1prm=b1;// Unboxing
        System.out.println(b1prm);

        Byte byte1=Byte.valueOf("113");
        System.out.println(byte1);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println("_________");


        Integer number1=5;
        Integer number2=10;

        System.out.println(number1+number2);
        System.out.println(number1.equals(number2));

        Boolean boolean1=false;
        Boolean boolean2=false;
        System.out.println(boolean1.equals(boolean2));

        int number3=Integer.parseInt("9"); // covert int
        System.out.println(number3);

        double number4=Double.parseDouble("3.5");
        System.out.println(number4);

        int number7=Integer.sum(5,2);
        System.out.println(number7);

}

}
