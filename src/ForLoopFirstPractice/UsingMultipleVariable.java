package ForLoopFirstPractice;



public class UsingMultipleVariable {
    public static void main(String[] args) {
        // in the initializaiton part variable data types must be the same
        //

        for(int k=5, ln=10; k<5;k++) {
            System.out.println(k);
        }
        for(int i=0;i<3;i++){
            for(int k=1;k<3;k++){
                System.out.println(i);
                System.out.println(k);
            }
        }
    }
}
