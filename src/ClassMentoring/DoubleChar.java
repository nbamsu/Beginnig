package ClassMentoring;

public class DoubleChar {
    public static void main(String[] args) {

        String str ="ABC";
        String st="";
        for (int i=0;i<str.length();i++){
            st=st+str.charAt(i)+str.charAt(i);
            System.out.println(str.charAt(i));// return type is char
        }
        //System.out.println(str.substring(0,1));// return type String
        System.out.println(st);

    }
}
