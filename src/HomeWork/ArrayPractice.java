package HomeWork;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //String [] name={"John Doe", "Sarah Clark", "Harsh Patel", "Philip Brown", "Mike Clark"};
        //Arrays.sort(name);
        //System.out.println(Arrays.toString(name));

        String[] names = {"John Doe", "Sarah Clark", "Harsh Patel", "Philip Brown", "Mike Clark"};
        String[] lastNames = new String[names.length];
        String str = "";
        String min1 = lastNames[0];
        String min2 = names[0];
        int num[] = new int[names.length];
        int min = 0;
        for (int i = 0; i < names.length; i++) {
            for (int k = 0; k < names[i].length(); k++) {
                if (names[i].substring(k, k + 1).equals(" ")) {
                    str = names[i].substring(k + 1) + " " + names[i].substring(0, k);
                }
            }
            num[i] = str.charAt(0);
            lastNames[i] = str;
        }System.out.println(Arrays.toString(lastNames));
       // System.out.println(Arrays.toString(names));
        for (int j = 0; j < lastNames.length; j++) {
            for (int n = j + 1; n < lastNames.length; n++) {
                for(int l=0;l<lastNames[j].length()-1;l++) {
                    if (lastNames[j].charAt(0) >=lastNames[n].charAt(0)) {
                        min1 = lastNames[j];
                        lastNames[j] = lastNames[n];
                        lastNames[n] = min1;
                        min2 = names[j];
                        names[j] = names[n];
                        names[n] = min2;
                    } else if (lastNames[j].charAt(0) == lastNames[n].charAt(0)) {
                        if (names[j].charAt(0) >=names[n].charAt(0)) {
                            min2 = names[j];
                            names[j] = names[n];
                            names[n] = min2;
                        }
                    }
                }
            }
        }//System.out.println(Arrays.toString(lastNames));
        System.out.println(Arrays.toString(names));
    }


    }
