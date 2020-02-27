package ClassMentoring;

public class Numbers {
    public static void main(String[] args) {
        int num=123456;
        int sum=0;
        int mult=0;
        while (num>0){
            mult=mult+(num%10)*(num%10);
        sum+=num%10;
        num=num/10;

    }
        System.out.println(sum);
        System.out.println(mult);
        System.out.println(mult-sum);
    }
    int []number={1,2,3,2,5,4,4,3,5,1,7,8,9};

}
