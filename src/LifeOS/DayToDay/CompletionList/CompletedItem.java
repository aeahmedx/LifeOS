package LifeOS.DayToDay.CompletionList;

import java.time.LocalDate;

public class CompletedItem {

    private String completedItems;
    private LocalDate date;

    public String getCompletedItems() {
        return completedItems;
    }

    public void setCompletedItems(String completedItems) {
        this.completedItems = completedItems;
    }
}
