package Pirmitives;

public class PrePost {
    public static void main(String[] args) {

        int carNumber=10;
        int totalInventor=++carNumber*3 / carNumber-- + --carNumber;
        System.out.println("result is "+totalInventor);
        System.out.println("car number is "+carNumber);



        int n=4;
        int result=++n + n++ -5;
        //5+5-5=5
        //n=6
        System.out.println("n is "+n);


        int sNumber=13;


        int totalStudentNumber=sNumber++ %5 * ++sNumber - sNumber--/2;
        //sNumbera++= 13 = 13%5=3
        // sNumber=14
        // 3 * ++sNumber=45
        //sNumber=15
        //45 - sNumber-- /2
        //sNumber--/2
        //15/2=7
        //sNumber =14
        //45-7=38
        //
        System.out.println(sNumber);//14
        System.out.println(totalStudentNumber);//38



        int k=8;
        int _result=5 *k++ - k-- / k++ % --k;
        //5 * 8 = 40         //5*8
        //k = 9              //
        //8/8=1
        //k--/k++=1
        //1%7=0
        //40 - 1=39
        System.out.println(k);
        System.out.println(_result);





    }
}
