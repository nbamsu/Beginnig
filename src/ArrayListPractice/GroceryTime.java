package ArrayListPractice;

public class GroceryTime {
    public static void main(String[] args) {
        GroceryStore groceryStore=new GroceryStore(12);
        System.out.println(groceryStore.isOpen());
        groceryStore.car();
        groceryStore.buy("Oil");
        System.out.println(groceryStore.shoppingList);
        groceryStore.buy("Potato");
        System.out.println(groceryStore.shoppingList);
        groceryStore.buy("Milk");
        System.out.println(groceryStore.shoppingList);
        groceryStore.returnItem("Milk");
        System.out.println(groceryStore.shoppingList);
        groceryStore.returnItem("oil");
        System.out.println(groceryStore.shoppingList);

    }
}
