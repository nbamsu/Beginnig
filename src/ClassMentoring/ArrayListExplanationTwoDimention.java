package ClassMentoring;

import java.util.Arrays;

public class ArrayListExplanationTwoDimention {
    public static void main(String[] args) {
        int [][] num={{1,2,3},{4,5,6}};
        for (int i=0;i<num.length;i++){
            for (int j=0;j<num[i].length;j++){
                System.out.println(num[i][j]);
            }
           // System.out.println(Arrays.toString(num[i])); print separate array.
        }
    }
}
