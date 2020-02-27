package ARRAY;

public class ReversStringWords {
    public static void main(String[] args) {
        String [] word={"Tech","Array"};
        String reversed="";

        for (int i=0;i<word.length;i++){
            for (int k=word[i].length()-1;k>=0;k--){
                System.out.print(word[i].charAt(k)+" ");


            }
            System.out.println();
        }
        String [] values={"Tech","Array","Object","Forloop","IndexNumber"};
        for (String value: values){
            for (int i=value.length()-1;i>=0;i--){
                char ch=value.charAt(i);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
