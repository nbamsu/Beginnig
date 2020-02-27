package ARRAY;

import java.util.Arrays;

public class MissinNumber {
    public static void main(String[] args) {
        int [] num={0,1,2,3,5,6,7,8,9};
        for (int i=0;i<num.length;i++){
            if (i!=num[i]){
                System.out.println(i);
                break;
            }
        }


      /*int [] number={12,13,14,15,16,18,19};
        for (int i=0;i<number.length;i++){
            if (i+11!=number[i]){
                System.out.println(i+11);
                break;
            }

            }*/

        int [] player ={4,7,1,25,35,18,22};
        for(int i=0;i<player.length;i++){
            int temp=0;
            for(int k=i+1;k<player.length;k++){
                if (player[i]>player[k]){
                temp=player[i];
                player[i]=player[k];
                player[k]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(player));
    }
    }

