package StringBuilderPackage;

public class StringBuilderPractice {
    public static void main(String[] args) {
        String str="";
        for (char i='A';i<'Z';i++){
            str+=i;
        }
        System.out.println(str);
     StringBuilder strBuilder=new StringBuilder();
     String str3="10";
     str3.concat("20");
        System.out.println("String value is "+str3);
     //dynamic Polymorphism--> Its related with method overloading. Until runtime java not know which
        // method to call.At runtime according to the parameter java will decide which method to use.
     strBuilder.append(10);
        System.out.println(strBuilder);
        strBuilder.append(20);
        System.out.println(strBuilder);
        //string is immutable,StringBuilder is mutable
        // to change the vale of StringBuilder object, Return tye of method  must be StringBuilder
        StringBuilder builder=new StringBuilder("Techtorial");
        builder.append(2019).append(true);
        // if you  want to method chaining, return type must be StringBuilder.



        System.out.println(builder);
         StringBuilder builder1=new StringBuilder("Working Hard");
        builder1.append("in 2010");
        StringBuilder builder2=builder1.append("Summer");
        System.out.println(builder1);
        System.out.println(builder2);
        builder2.append(true).append(2.6);
        System.out.println(builder1);
        System.out.println(builder2);
        StringBuilder builder3=new StringBuilder("School");
        builder1=builder3;
        System.out.println(builder1);
        builder3=null;


        StringBuilder method=new StringBuilder("Computer");
        System.out.println(method.charAt(2)=='m');// after chatAt we van not use StringBuilder.
        System.out.println(method.indexOf("k"));
       // System.out.println(method.charAt(10)=='m');
        System.out.println(method.length());
        System.out.println(method.substring(2,7));// 2,3,4,5,6 mpute
        //return type of substring is String.
        method.substring(4);//After substring method we can not use another StringBuilder method
        //However, we can use String method since substring is returning String.
        System.out.println(method);// return will be Computer because return type should be StringBuilder


        method.insert(6,"Apple");
        System.out.println(method);
        String string="Computer";
        string=string.replace("er","er Apple").replace("mr","r");
    }
}
