package ForLoopFirstPractice;

public class CharLoop {
    public static void main(String[] args) {
        char ch='a';
        for(;ch<'z';ch++){
            int num=ch; // it will print only numbers of letter
            System.out.print(ch+" "+num);
            System.out.println();
        }
    }
}
