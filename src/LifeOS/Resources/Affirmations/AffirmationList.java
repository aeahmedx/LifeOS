package LifeOS.Resources.Affirmations;

import java.util.ArrayList;

public class AffirmationList {

    static ArrayList<Affirmation> affirmations;

    public static ArrayList<Affirmation> getAffirmations() {
        return affirmations;
    }

    public static void setAffirmations(ArrayList<Affirmation> affirmations) {
        AffirmationList.affirmations = affirmations;
    }
}
