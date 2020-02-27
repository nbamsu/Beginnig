package StringBuilderPackage;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.ArrayList;

public  class StringBuilderWitthArrayList {
    public static void updateList(ArrayList<StringBuilder> builder){
        for (int i=0;i<builder.size();i++){
            builder.get(i).deleteCharAt(builder.get(i).length()-1);
            builder.get(i).insert(builder.get(i).length(),"m");
        }
    }

    public static void main(String[] args) {
        ArrayList<StringBuilder> last=new ArrayList<>();
        StringBuilder table=new StringBuilder("Table");
        StringBuilder phone=new StringBuilder("Phone");
        StringBuilder pencil=new StringBuilder("Pencil");
        last.add(table);
        last.add(new StringBuilder("Caup"));
        last.add(phone);
        last.add(pencil);
        updateList(last);
        System.out.println(last);

    }
}
