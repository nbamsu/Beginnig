package ForLoopFirstPractice;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int preNumber = 0;
        int nextNumber = 1;
        int count=0;
        for (int i = 1; i <= 100; i++) {
           // if(preNumber<=100){
            if (preNumber > 100) {
                break;
            }

            System.out.println(preNumber + "");

            int sum = preNumber + nextNumber; //0+1=1
            preNumber = nextNumber;//1
            nextNumber = sum;
            count++;
        }


}}


