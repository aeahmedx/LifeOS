package LifeOS.DayToDay.DailyCompoundingHabits;

public class Habit {

    private String habit;
    private int minutes;

    public Habit(String habit, int minutes) {
        this.habit = habit;
        this.minutes = minutes;
    }

    public Habit(String habit) {
        this.habit = habit;
    }

    public String getHabitName() {return habit;}

    public void setHabitName(String habit) {
        this.habit = habit;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
