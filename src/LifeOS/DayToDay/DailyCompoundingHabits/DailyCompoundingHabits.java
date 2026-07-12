package LifeOS.DayToDay.DailyCompoundingHabits;

import java.util.ArrayList;

public class DailyCompoundingHabits {

    static ArrayList<Habit> habits;

    public static ArrayList<Habit> getHabits() {
        return habits;
    }

    public static void setHabits(ArrayList<Habit> habits) {
        DailyCompoundingHabits.habits = habits;
    }
}
