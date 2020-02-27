package ArrayListPractice;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class GroceryStore {

    /*
    This class will automatically add values to shopping List and will Print "Welcome to store" message with items that need to be bought from store
    Method:
    buy(String item) --> this method has to remove specific item from your shopping list
    return(String item) --> this will add returned item back to shopping list
    car () --> has to print Heading to grocery store message
    isOpen() --> has to print True if store is open, False if not
     */
    static int time;

    static List<String> shoppingList = new ArrayList();

    static {
        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Cereal");
        shoppingList.add("Potato");
        shoppingList.add("Oil");
        System.out.println("Welcome to Grocery store!!!");
        System.out.println(shoppingList);
    }

    public static void buy(String item) {
        shoppingList.remove(item);
    }

    public static void returnItem(String item) {
        shoppingList.add(0, item);
    }

    public static void car() {
        System.out.println("Heading to grocery store");
    }

    public GroceryStore(int time){
        this.time=time;
    }
    public static boolean isOpen(){
        if(time>=9 && time<=21){
            return true;
        }else{
            return false;
        }
    }

}
