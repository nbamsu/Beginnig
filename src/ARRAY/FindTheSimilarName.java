package ARRAY;

public class FindTheSimilarName {
    public static void main(String []args){
        String []names={"Azhar,Tima,Asan,Dmitry,Erma,Tima,Jailya,Asan,Tima"};
        //String []countedName=new String[names.length];
        String str="";

        for (int i=0;i<names.length;i++){
        int count=1;
        str+=names[i];

            for (int k=i+1;k<names.length;k++){
                if (names[i].equalsIgnoreCase(names[k])){
                    count++;
                }
            }
            System.out.println(names[i] +"count is"+ count  );
        }
    }
}
