package ARRAY;

import java.util.Arrays;

public class TwodimensionalArray {
    public static void main(String[] args) {
        int[][] containers=new int[2][3];
        containers[0][0]=15;
        containers[0][1]=25;
        containers[0][2]=90;
        //containers[0][3]=40 return out put will be out of bound of Exception.
        containers[1][0]=60;
        containers[1][1]=80;
        containers[1][2]=90;
        System.out.println(Arrays.toString(containers[0]));
        System.out.println(Arrays.toString(containers[1]));
        //To print both arrays in one system out
        for (int i=0;i<containers.length;i++){
            //containers.length will go up to 2 because my containers array includes only two another array
            for (int k=0;k<containers[i].length;k++){
                //containers[i].length will get the size of your inner array
                System.out.println(containers[i][k]);
            }
        }
    }
}
