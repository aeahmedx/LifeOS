package LifeOS.DayToDay.DailyCompoundingHabits;

public class Habit {

    static String habitname;
    static int minutes;

    public static String getHabitname() {
        return habitname;
    }

    public static void setHabitname(String habitname) {
        Habit.habitname = habitname;
    }

    public static int getMinutes() {
        return minutes;
    }

    public static void setMinutes(int minutes) {
        Habit.minutes = minutes;
    }
}
