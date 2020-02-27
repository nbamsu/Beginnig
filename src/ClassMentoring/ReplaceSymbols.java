package ClassMentoring;

public class ReplaceSymbols {
    String str = "03-6-2018T:23:0001";

    public static void daterMethod(String str) {
        str = str.replace("-", "/");
        System.out.println(str.substring(0, str.indexOf("T")));
    }
    public static String updateDate1(String str){
        String [] arr=str.split("T");
        str=arr[0].replace('-','/');
        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        ReplaceSymbols.daterMethod("03-6-2018T:23:0001");
        updateDate1("03-6-2018T:23:0001");


    }
}