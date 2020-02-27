package StringPractice;

public class ReplacePracice {
    public static void main(String[] args) {
        String str="Microphone";
        str=str.replace("on", "an");
        System.out.println(str);
      String db=" jdk1.8.0 151 ";
      String java="jdk-1.8.0 151";
      java=java.replace("-"," ");
        System.out.println("The verification "+db.equals(java));


        java.replace("p","s");
        // If you try to replace the vale which is nit exists
        //in the String. It will not throw the error. Since , there is not replacement value, it will not change anything
        System.out.println(db);
        db=db.trim();
        System.out.println(db);

    }
}
