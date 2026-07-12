package LifeOS.Resources.Groceries;

public class GroceryItem {

    static String foodname;
    static String foodcategory;
    static double cost;

    public static String getFoodname() {
        return foodname;
    }

    public static void setFoodname(String foodname) {
        GroceryItem.foodname = foodname;
    }

    public static String getFoodcategory() {
        return foodcategory;
    }

    public static void setFoodcategory(String foodcategory) {
        GroceryItem.foodcategory = foodcategory;
    }

    public static double getCost() {
        return cost;
    }

    public static void setCost(double cost) {
        GroceryItem.cost = cost;
    }
}
