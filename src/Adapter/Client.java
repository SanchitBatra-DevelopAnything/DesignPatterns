package Adapter;

public class Client {
    public static void main(String[] args) {
        SwiggyStore store = new SwiggyStore();
        store.itemList.add(new FoodItem());
        store.itemList.add(new FoodItem());

//        store.itemList.add(new GroceryProduct()); //not compaitible

        store.itemList.add(new GroceryItemAdapter(new GroceryProduct()));
        //as grocery item adapter implements item , it is also an item , which helps to convert grocery item to item for
        //compaitiblity
    }
}
