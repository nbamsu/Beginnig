package HomeWork;

public class ArrayLargestNumberSelf {
    public void ArrayLN(int []num){
        int temp=num[0];
        for (int i=0;i<num.length;i++){
            if (num[i]>temp){
                temp=num[i];
            }
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        int number[]={10,20,25,4,2,8,19,33,14};
        ArrayLargestNumberSelf arr=new ArrayLargestNumberSelf();
        arr.ArrayLN(number);
    }
}
