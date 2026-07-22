package LifeOS.DayToDay.CompletionList;

import java.time.LocalDate;

public class CompletedItem {

    private String completedItem;
    private LocalDate date;

    public CompletedItem(String completedItem, LocalDate date) {
        this.completedItem = completedItem;
        this.date = date;
    }

    public CompletedItem(String completedItem) {
        this.completedItem = completedItem;
    }

    public String getCompletedItem() {
        return completedItem;
    }

    public void setCompletedItems(String completedItems) {
        this.completedItem = completedItems;
    }

}
