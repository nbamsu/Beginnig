package HomeWork;


import java.util.Arrays;

public class ArraySortingWithOutMethodSelf {
    public void ArraySort(int []num){

       for (int i=0;i<num.length;i++){
        for (int j=i+1;j<num.length;j++){
            if(num[i]>num[j]){
                int temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
       }
        System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
        int [] numb={10,14,74,85,0,21,36,96,11};
        ArraySortingWithOutMethodSelf ar=new ArraySortingWithOutMethodSelf();
        ar.ArraySort(numb);
    }
}
