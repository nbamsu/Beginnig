package EqualityPractice;

public class PassByValue {
    public static void updateNumber(int num){
        num=10;

    }
    public static  String updateWord(String str){
        str="Java is my world";
        return str;
    }
    public static double updateDoouble(double bl){

        bl=bl*10%5;// this method return manipulated value. However it will not change your original parameters.
        return bl;
    }

    public static void main(String[] args) {
        int num=5;
        String str="Java";

        updateNumber(num);// java copy the value, because we reassigned =5
        System.out.println(num);
        updateWord(str);// Java is working with pass by value.Because it will not change the str value.
        // Java will take copy of my str, it will keep working on java
        System.out.println(str);

        double bl=6.4;
        updateDoouble(bl);

        System.out.println(bl);
        System.out.println(updateDoouble(bl));
        bl=updateDoouble(bl);// if you want to change your original value, you need to re-assign it again.
        System.out.println(bl);

        String str1="";
        for (char i='A';i<'Z';i++){
            str1+=i;


        }System.out.println(str1);


    }
}
