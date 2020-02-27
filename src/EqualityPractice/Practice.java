package EqualityPractice;

public class Practice {
    public void equals(){
        System.out.println("this is equals method in Practice");
    }
    public static Practice createPractice(){
        Practice pr=new Practice();
        return pr;
    }
    public static void main(String[] args) {

        Practice practice=new Practice();
        Practice practice1=new Practice();
        Practice pratcice2=practice;

        System.out.println(practice==practice1);
        System.out.println(practice.equals(practice1));
        System.out.println(practice.equals(pratcice2));
        System.out.println(practice==pratcice2);
        practice.equals();

        String name="Tima";
        String name1="Tima";
        String name2=new String("Tima");

        System.out.println(name.equals(name2));
        System.out.println(name==name1);

        Integer num=10;
        Integer num1=new Integer(10);
        System.out.println(num==num1);
        System.out.println(num.equals(num1));
}
}
