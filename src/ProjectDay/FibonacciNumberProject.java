package ProjectDay;

public class FibonacciNumberProject {

  public static void fibonacci(int limit){
     int preNumber=0;
      int nextNumber=1;
       int count=0;
        int sum;
    for(int i=1;i<=limit;i++){
        if (preNumber > limit) {
            break;
        }
        System.out.println(preNumber+ "");
         sum=preNumber+nextNumber;
        preNumber=nextNumber;
        nextNumber=sum;
        count++;

    }

}

    public static void main(String[] args) {
    FibonacciNumberProject.fibonacci(25);

    }


}