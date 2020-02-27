package ObjectPractice;

public class MathMethod {
    // Iwant to create one method, it will take the one parameter as a int.
    //Once I call this method, it will return square of the parameter
    public int square(int number){
        int squareNum=number*number;
        return squareNum;
    }

    public void multiplicationValue(int number){
        for (int i=1;i<=10;i++){
            System.out.println(number+"*"+i+"="+(number*i));
        }
    }
     int sum(int num1, int num2){
	return num1+num2;
}
int remainder(int num1,int num2){
        return num1%num2;
}
public int sumArray(int [] numbers){
	int sum=0;
	for(int i=0;i<numbers.length;i++){
	sum+=numbers[i];
	}
    System.out.println("Sum of the array is "+sum);
	return sum;
}
public void printLetters(String str){
        for (char i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
}

    public static void main(String[] args) {
        MathMethod test=new MathMethod();
        int result =test.square(9);
        System.out.println(result);
        test.multiplicationValue(5);
        test.multiplicationValue(8);
        test.multiplicationValue(10);

        int resultSum=test.sum(10,8);
        System.out.println(resultSum);

        int resultRemainder=test.remainder(56,6);
        System.out.println(resultRemainder);

        int[] nums={10,5,20,40,30};
        int sumOfArray=test.sumArray(nums);
        System.out.println(sumOfArray);

        int [] values={10,5,20,40,30,3,54,7,2346,78,2,257,5};
        int sumOfArray1=test.sumArray(values);
        System.out.println(sumOfArray1);

        /*Task
        write the method will take one parameter as a String value.
        It will print all the char for this String value.
        "School"
        output:
        S
        c
        h
        o
        o
        l

         */

        test.printLetters("Thectorial Academy "+" School");

    }





}
