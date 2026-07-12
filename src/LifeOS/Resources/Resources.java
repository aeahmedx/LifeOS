package LifeOS.Resources;

import LifeOS.Resources.Affirmations.AffirmationList;
import LifeOS.Resources.Exercises.Exercises;
import LifeOS.Resources.Groceries.GroceryList;
import LifeOS.Resources.LinksDealsNotes.LinksDealsNotes;

import java.util.ArrayList;

public class Resources {

    private Exercises exercises;
    private GroceryList groceryList;
    private AffirmationList affirmationList;
    private LinksDealsNotes linksDealsNotes;

    public Exercises getExercises() {
        return exercises;
    }

    public GroceryList getGroceryList() {
        return groceryList;
    }

    public AffirmationList getAffirmationList() {
        return affirmationList;
    }

    public LinksDealsNotes getLinksDealsNotes() {
        return linksDealsNotes;
    }

}
