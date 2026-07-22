package LifeOS.DayToDay.CompletionList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CompletionList {

   private ArrayList<CompletedItem> completedItems;
   private ArrayList<CompletedItem> todayitems;

    public CompletionList() {
        completedItems = new ArrayList<>();
        todayitems = new ArrayList<>();
    }

    public ArrayList<CompletedItem> getCompletedItems() {
        return completedItems;
    }

    public void setCompletedItems(ArrayList<CompletedItem> completedItems) {
        this.completedItems = completedItems;
    }

    public void displayAllCompletedItems() {
        for (int i = 0; i < completedItems.size(); i++) {
            System.out.println((i + 1) + ". " + completedItems.get(i));
        }
    }

///// boolean flag on today tasks + date marker//
//    public void displayTodaysCompletedItems() {
//        for (int i = 0; i < completedItems.size(); i++) {
//
//
//
//            if todayitems.get(i).date = LocalDate.now() {
//                Completed
//                todayitems.add()
//            }
//
//        }
//
//    }

    public void createCompletedItem() {
        displayAllCompletedItems();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Completed Item: ");
        String completedItemText = input.nextLine();

        CompletedItem completedItem = new CompletedItem(completedItemText, LocalDate.now());

        completedItems.add(completedItem);

    }

    public void deleteCompletedeItem() {

        displayAllCompletedItems();

        Scanner input = new Scanner(System.in);

        System.out.println("Completed Item To Delete");
        int choice = input.nextInt();

        completedItems.remove(choice - 1);
    }





}
