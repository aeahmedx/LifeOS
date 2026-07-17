package LifeOS.DayToDay.CompletionList;

import java.util.ArrayList;

public class CompletionList {

   private ArrayList<CompletedItem> completedItems;
   private ArrayList<CompletedItem> todayitems;

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

/// boolean flag on today tasks + date marker//    
    public void displayTodaysCompletedItems() {
        for (i = 0; i < completedItems.size(); i++) {

            
            
            if todayitems.get(i).date = LocalDate.now() {
                Completed
                todayitems.add()
            }

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

        completedItems.remove(choice - 1);
    }





}
