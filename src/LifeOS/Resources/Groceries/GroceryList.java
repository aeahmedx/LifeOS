package LifeOS.Resources.Groceries;

import java.util.ArrayList;

public class GroceryList {

    static ArrayList<GroceryItem> groceryItems;

    public static ArrayList<GroceryItem> getGroceryItems() {
        return groceryItems;
    }

    public static void setGroceryItems(ArrayList<GroceryItem> groceryItems) {
        GroceryList.groceryItems = groceryItems;
    }
}
