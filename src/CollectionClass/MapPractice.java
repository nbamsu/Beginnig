package CollectionClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, Integer> ageList=new HashMap<>();
        ageList.put("Ariet",05);
        ageList.put("Diman",06);
        ageList.put("Stamov",28);
        ageList.put("Shirin",18);
        System.out.println(ageList);
        // HashMap has no order
        Map<String, Integer> listOfAge=new HashMap<>();
        listOfAge.putAll(ageList);
        System.out.println(listOfAge);
        //keySet --> it wil return Set of keys (only the keys)
        System.out.println(ageList.get("Ariet"));
        //get method, you need to provide the kye and it will give you the value
        Set<String> ageKyes=ageList.keySet();
        for (String keys:ageKyes){
            System.out.println(keys+" ---> "+ "Printing only the values: "+ageList.get(keys));
        }


    }
}
