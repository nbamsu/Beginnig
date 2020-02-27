package lambdaIntro;

public class LambdaPractice {
    public static void main(String[] args) {
       Nums lam=(x,y)-> x+y;
        System.out.println(lam.getSum(3,4));
        //TypeInference

//
//    Nums n=new Nums() {
//        @Override
//        public int getSum(int name, int num) {
//            return 0;
//        }
//    };

    }


}
