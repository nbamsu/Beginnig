package CollectionClass;

import java.util.*;

public class CarStore {
    public static void main(String[] args) {

        Map<String,Car> store=new LinkedHashMap();
        store.put("A123B", new Car("Corolla",2020,180,"Toyota"));
        store.put("A100C", new Car("Camry",2000,220,"Toyota"));
        store.put("A145M", new Car("Prius",2017,150,"Toyota"));
        store.put("A147N", new Car("TL",2013,210,"Acura"));
        store.put("A412B", new Car("MDX",2000,300,"Acura"));
        store.put("A745C", new Car("M3",2017,400,"BMW"));
        store.put("A789N", new Car("570 LX",2020,500,"LEXUS"));
        store.put("A879L", new Car("Land Cruiser",2010,500,"Toyota"));
        store.put("A325S", new Car("ES 200",1999,200,"LEXUS"));
        store.put("A458A", new Car("SIENA",1998,180,"Toyota"));

        Set<String> vinNumber=store.keySet();
        for (String vin:vinNumber){
            //System.out.println(vin);
            if (vin.equals("A745C")){
                System.out.println(store.get(vin));
                //System.out.println(store.get(vin).getModel());

            }
        }
        Set<Map.Entry<String,Car>> setOfCars=store.entrySet();
        for (Map.Entry<String,Car> sets: setOfCars){
            if (sets.getKey().equals("A789N")){
                System.out.println(sets.getValue());
            }
        }
        for (Map.Entry<String,Car> cars:setOfCars){
            System.out.println(cars);
        }
        //hashTable
        /*
        -- is synchronized
        -- it's slower them HashMap or TreeMap
        -- You can not store null key and values
         */
        Hashtable<Integer,String> computer= new Hashtable();
        computer.put(1234,"MAC");
        computer.put(3216,"Windows");
        computer.put(3254,"Schools computer");
        //computer.put(null, null);
        Set<Integer>ipAddress=computer.keySet();
        for (Integer ip:ipAddress){
            System.out.println(computer.get(ip));
        }

    }
}
