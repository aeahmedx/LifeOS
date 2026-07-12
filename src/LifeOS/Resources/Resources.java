package LifeOS.Resources;

import LifeOS.Resources.Affirmations.AffirmationList;
import LifeOS.Resources.Exercises.Exercises;
import LifeOS.Resources.Groceries.GroceryList;
import LifeOS.Resources.LinksDealsNotes.LinksDealsNotes;

import java.util.ArrayList;

public class Resources {

    static Exercises exercises;
    static GroceryList groceryList;
    static AffirmationList affirmationList;
    static LinksDealsNotes linksDealsNotes;

    public static Exercises getExercises() {
        return exercises;
    }

    public static void setExercises(Exercises exercises) {
        Resources.exercises = exercises;
    }

    public static GroceryList getGroceryList() {
        return groceryList;
    }

    public static void setGroceryList(GroceryList groceryList) {
        Resources.groceryList = groceryList;
    }

    public static AffirmationList getAffirmationList() {
        return affirmationList;
    }

    public static void setAffirmationList(AffirmationList affirmationList) {
        Resources.affirmationList = affirmationList;
    }

    public static LinksDealsNotes getLinksDealsNotes() {
        return linksDealsNotes;
    }

    public static void setLinksDealsNotes(LinksDealsNotes linksDealsNotes) {
        Resources.linksDealsNotes = linksDealsNotes;
    }
}
