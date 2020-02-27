package Store;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class Macys extends StoreClass{
    String name="Macy's";
    public void sellClothes(){
        System.out.println("Selling clothes from "+name);// by default method using THIS.name// keyword SUPER letting us print StoreClass name
    }
    public static void staticMethod(){
        System.out.println("Macy's class static Method");
    }
    public String toString(){
        return name+" is located in Chicago";
    }

    public static void main(String[] args) {
        Macys macys=new Macys();
        macys.sellClothes();
        System.out.println(macys.name);
        macys.staticMethod();

        //Reference side is deciding which variables and method to call
       StoreClass store=new StoreClass();
        System.out.println(store.name);
        store.staticMethod();

        //reference side deciding
//        StoreClass storeClass=new Macys();
//        System.out.println(storeClass.name);
//        storeClass.staticMethod();
//
//        Object store2=new Macys();
//        System.out.println(store2.toString());
//
//        Object store3=new StoreClass();
//        System.out.println(store3.toString());
        StoreClass store1=new StoreClass();
        store1.sellClothes();
        StoreClass storeClass=new Macys();
        storeClass.sellClothes();

        //Runtime Polymorphism/ Dynamic Binding / Overriding method
        //Compile time Polymorphism / Static Binding /OverLoading method

    }
}
