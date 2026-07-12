package LifeOS.Overarch.LongTermGoals;

import java.time.LocalDate;

public class Goal {

    private String thegoal;
    private String thewhy;
    private LocalDate goaldeadline;
    private String dailyminimum;

    public String getThegoal() {
        return thegoal;
    }

    public void setThegoal(String thegoal) {
        this.thegoal = thegoal;
    }

    public String getThewhy() {
        return thewhy;
    }

    public void setThewhy(String thewhy) {
        this.thewhy = thewhy;
    }

    public LocalDate getGoaldeadline() {
        return goaldeadline;
    }

    public void setGoaldeadline(LocalDate goaldeadline) {
        this.goaldeadline = goaldeadline;
    }

    public String getDailyminimum() {
        return dailyminimum;
    }

    public void setDailyminimum(String dailyminimum) {
        this.dailyminimum = dailyminimum;
    }
}
