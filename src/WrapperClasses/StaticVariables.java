package WrapperClasses;

public class StaticVariables {
    public static void main(String[] args) {
        Variables var1=new Variables(5,6);
        //var1.variable1=5;
        //var1.variable2=6;
        //var1.staticV=3;
        //var2.staticV=3;
        Variables var2=new Variables(10,12);
        //var2.variable1=10;
        //var2.variable2=12;
        var2.staticV=11; //var2.staticV=11;
                         //var1.staticV=11;
                         //Variables.staticV=11;
        var1.variable1=var1.variable2+var1.staticV;//6+11=17
        var1.staticV=var2.variable2+var2.staticV; //12+11=23
        var2.variable1=var1.variable1+var2.staticV;//17+23=40
        System.out.println(var1.variable1);
        System.out.println(var1.staticV);
        System.out.println(var2.variable1);
        System.out.println(var2.staticV);
    }
}
