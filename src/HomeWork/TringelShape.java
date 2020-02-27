package HomeWork;

public class TringelShape {
    public static void main(String[] args) {
        int spaces=5;

        for (int i=0;i<6;i++){
            for(int j= spaces; j>=0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            spaces--;
            System.out.println("");
        }
    }
}

