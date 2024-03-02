package Adapter;

public class GroceryItemAdapter implements Item{
    GroceryItem groceryItem;

    public GroceryItemAdapter(GroceryItem item)
    {
        this.groceryItem = item;
    }

    @Override
    public String getName() {
        return this.groceryItem.getName();
    }

    @Override
    public String getPrice() {
        return this.groceryItem.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return this.groceryItem.getStoreName();
    }
}
