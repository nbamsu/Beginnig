package HomeWork;

public class ReversString {
    public static void main(String[] args) {
        String name="Bakytbek";
        String reversed="";
        int length=name.length()-1;
        while(length>=0){
            reversed+=name.charAt(length);
            length--;
        }
        System.out.println(reversed);
    }
}
