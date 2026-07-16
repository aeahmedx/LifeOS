package LifeOS.DayToDay.CompletionList;

import java.util.ArrayList;

public class CompletionList {

   private ArrayList<CompletedItem> completedItems;

    public ArrayList<CompletedItem> getCompletedItems() {
        return completedItems;
    }

    public void setCompletedItems(ArrayList<CompletedItem> completedItems) {
        this.completedItems = completedItems;
    }

    public void displayAllCompletedItems() {
        for (i = 0; i < completedItems.size(); i++) {
            System.out.println((i + 1) + ". " + completedItems.get(i));
        }
    }

    public void displayAllCompletedItems() {
        while ()
            System.out.println((i + 1) + ". " + completedItems.get(i));
        }
    }

    public void createCompletedItem() {
        displayAllCompletedItems();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Completed Item: ");
        String completedItem = input.nextLine();

        CompletedItem completedItem = new completedItem(completedItem);

        completedItems.add(completedItem);

    }

    public void deleteCompletedeItem() {
        displayAllCompletedItems

        System.out.println("Completed Item To Delete");
        int choice = input.nextInt();

        completedItems.remove(choice -1);
    }



}
