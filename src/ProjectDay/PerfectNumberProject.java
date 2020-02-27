package ProjectDay;



public class PerfectNumberProject {
    public static boolean perfectNumber(int num){
       int div=1;
       int sum=0;
       do{
           if(num%div==0){
               sum+=div;
           }
           div++;
       }while(div<num);
           if (sum==num) {
               System.out.println(true);
           }else{
               System.out.println(false);
           }

        return true;
    }

    public static void main(String[] args) {
        PerfectNumberProject.perfectNumber(6);

    }
}
