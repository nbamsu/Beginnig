package ForLoopFirstPractice;

import java.util.Arrays;

public class OptionalBraekcontinue {
    public static void main(String[] args) {
        String[] name = {"ARIET", "ULAN", "MUAMMER"};
        outer:
        for (int i = 0; i < name.length; i++) {
            innerLoop:
            for (int k = 0; k < name[i].length(); k++) {
                if (name[i].charAt(k) == 'I') {
                    //continue;
                    break innerLoop;
                }
                System.out.print(name[i].charAt(k) + ",");
            }
            System.out.println();  // thats help print every name in different lines
        }
        String[][] names = {{"Adam", "John"}, {"Kushal", "Priyanka", "Sameer"}, {"lee", "Mao"}};
        OptionalBraekcontinue lb=new OptionalBraekcontinue();
        lb.breakLoop(names);
        breakLoop(names);
    }
    public static void breakLoop(String [][]names){
        priyanka:
        for (int i=0;i<names.length;i++){
            for (int k=0;k<names[i].length;k++){
                if(names[i][k].equalsIgnoreCase("Priyanka")){
                    break priyanka;
                }
                System.out.println(names[i][k]);
            }
        }
    }



    }
