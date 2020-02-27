package ForLoopFirstPractice;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i);
            if(i==5){
                break; // it will stop execution in the loop(Termination)
            }
           // System.out.println(i); its mean print out will be 0, 1, 2, 3, 4, if break before SOUT
        }


        for(int i=0;i<3;i++){
            System.out.println(i);
            for(char ch='A';ch<'D';ch++){
                System.out.println(ch);
                if(ch=='B'){
                    break;

                }
            }
        }
    }
}
