package Adapter;

import java.util.ArrayList;

public class SwiggyStore {
    public ArrayList<Item> itemList;
    public SwiggyStore()
    {
        this.itemList = new ArrayList<Item>();
    }

    public void addItem(Item item)
    {
        this.itemList.add(item);
    }
}
