package LifeOS.Overarch.LongTermGoals;

import java.util.ArrayList;

public class LongTermGoals {

    static ArrayList<Goal> goals;

    public static ArrayList<Goal> getGoals() {
        return goals;
    }

    public static void setGoals(ArrayList<Goal> goals) {
        LongTermGoals.goals = goals;
    }
}
