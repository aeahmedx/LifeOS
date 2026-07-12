package LifeOS.DayToDay.CompletionList;

import java.util.ArrayList;

public class CompletionList {

   static ArrayList<CompletedItem> completedItems;

    public static ArrayList<CompletedItem> getCompletedItems() {
        return completedItems;
    }

    public static void setCompletedItems(ArrayList<CompletedItem> completedItems) {
        CompletionList.completedItems = completedItems;
    }
}
