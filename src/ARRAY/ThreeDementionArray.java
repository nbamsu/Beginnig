package ARRAY;

public class ThreeDementionArray {
    public static void main(String[] args) {
        String [][][] roomNames=new String [1][2][3];
        String [][][] rooms={{{"Room1","Room2","Room3"},{"Room1","Room2","Room3"}}};
        roomNames[0][0][0]="Room1";
        roomNames[0][0][1]="Room2";
        roomNames[0][0][2]="Room3";

        roomNames[0][1][0]="Room11";
        roomNames[0][1][1]="Room12";
        roomNames[0][1][2]="Room13";

        for (int i=0;i<roomNames.length;i++){
            for (int k=0;k<roomNames[i].length;k++){
                for (int t=0;t<roomNames[i][k].length;t++){
                    System.out.println(roomNames[i][k][t]);

                }
            }
        }
    }
}
