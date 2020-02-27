package ForLoopFirstPractice;

public class MultipleTerms {
    public static void main(String [] args){
        int k=5;

        for(int i=0,p=6;k>1 && i<6;k--,i++){
            System.out.println("P is the "+p++);// inside the loop

        }
        System.out.println(k);// outside the loop, output will be only one number
    }
}
