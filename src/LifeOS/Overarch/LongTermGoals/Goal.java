package LifeOS.Overarch.LongTermGoals;

import java.time.LocalDate;

public class Goal {

    static String thegoal;
    static String thewhy;
    static LocalDate goaldeadline;
    static String dailyminimum;

    public static String getThegoal() {
        return thegoal;
    }

    public static void setThegoal(String thegoal) {
        Goal.thegoal = thegoal;
    }

    public static String getThewhy() {
        return thewhy;
    }

    public static void setThewhy(String thewhy) {
        Goal.thewhy = thewhy;
    }

    public static LocalDate getGoaldeadline() {
        return goaldeadline;
    }

    public static void setGoaldeadline(LocalDate goaldeadline) {
        Goal.goaldeadline = goaldeadline;
    }

    public static String getDailyminimum() {
        return dailyminimum;
    }

    public static void setDailyminimum(String dailyminimum) {
        Goal.dailyminimum = dailyminimum;
    }
}
