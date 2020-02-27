package HomeWork;


import java.util.Arrays;

public class OddEvenNumbersArray {
    public static void main(String[] args) {
        int[] num = {11, 2, 13, 24, 5, 6, 45, 50};
        //Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.println("This is Odd numbers: " + num[i]);
            }
        }
        System.out.println();
            for (int k = 0; k < num.length; k++) {
                if (num[k] % 2 == 0) {
                    System.out.println("This is Even numbers: " + num[k]);
                }
            }

    }
}