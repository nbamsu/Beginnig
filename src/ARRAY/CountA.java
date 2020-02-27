package ARRAY;

public class CountA {
    public static void main(String[] args) {
        String [] sName={"Aiturgan","Aizhana","Aizharkyn","Dmitry","Erma","Jamilya"};

        for (String name:sName){ //This is FOREACH LOOP, Taking every element of String
            int count=0;
            for(int i=0;i<name.length();i++){  //FOR LOOP, taking every letter From String
                if (name.charAt(i)=='A'||name.charAt(i)=='a'){
                    count++;
                }
            }
            System.out.println(name+" A count is ----> "+count);

        }
    }
}
