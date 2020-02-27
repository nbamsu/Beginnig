package HomeWork;

public class ThinkEasyClass {
    public static void main(String[] args) {
       int sum=0;
        int mul=1;
        String str="";
        for (int i=1;i<=10;i++){
            str=str+"*";// "*" its for String output
           //System.out.println(1+"x"+i+"="+(1*i));
            System.out.println(str);
        }




        String str2="***********";
        for (int i=0;i<=10;i++){
            System.out.println(str2);
            str2=str2.substring(1);
        }



        String letter="";
        int count=0;
        for (char k='A';k<'Z';k++){
            letter=letter+k+" ";
            System.out.println(letter+"  :   "+count++);
        }



    }
}
