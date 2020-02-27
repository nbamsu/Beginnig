package ClassMentoring;

public class CatDog {
    public static void main(String[] args) {
        String str="catdogcatdogcatdogcatdog";
        
        int cn=0;
        int dn=0;
        for (int i=0;i<str.length()-2;i++){
            if(str.substring(i,i+3).equalsIgnoreCase("cat")){
                cn++;
            }else if (str.substring(i,i+3).equalsIgnoreCase("dog")){
                dn++;
            }

        }
        System.out.println(cn==dn);
    }
}
