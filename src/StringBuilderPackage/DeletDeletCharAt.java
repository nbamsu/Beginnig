package StringBuilderPackage;

public class DeletDeletCharAt {
    public static void revers(String str){
        StringBuilder builder=new StringBuilder(str);
        System.out.println(builder.reverse());
    }
    public static void main(String[] args) {
        StringBuilder succes = new StringBuilder();
        succes.append("preporation");
        succes.insert(0, "$");
        System.out.println(succes);
        System.out.println(succes.length());
        succes.insert(12, "$");
        System.out.println(succes);
        succes.delete(0, 3);
        System.out.println(succes);
        succes.deleteCharAt(succes.length() - 1);
        System.out.println(succes);

        String str="Truck";
        revers(str);
        String value=succes.toString();
        System.out.println(value);

//        StringBuilder method = new StringBuilder("Truck");
//        method.reverse();
//        System.out.println(method);

    }
   }

