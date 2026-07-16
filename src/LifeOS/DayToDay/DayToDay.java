package LifeOS.DayToDay;

import LifeOS.DayToDay.AppointmentsMeetings.AppointmentsMeetings;
import LifeOS.DayToDay.CompletionList.CompletionList;
import LifeOS.DayToDay.DailyCompoundingHabits.DailyCompoundingHabits;
import LifeOS.DayToDay.Finances.Finances;
import LifeOS.DayToDay.OpenLoops.OpenLoops;
import LifeOS.DayToDay.TodayTomorrow.Today.Today;
import LifeOS.DayToDay.TodayTomorrow.Tomorrow.Tomorrow;

public class DayToDay {

    private Today today;
    private OpenLoops openLoops;
    private CompletionList completionList;
    private Tomorrow tomorrow;
    private Finances finances;
    private DailyCompoundingHabits dailyCompoundingHabits;
    private AppointmentsMeetings appointments;

    public DayToDay() {}

    public Today getToday() {
        return today;
    }

    public OpenLoops getOpenLoops() {
        return openLoops;
    }

    public CompletionList getCompletionList() {
        return completionList;
    }

    public Tomorrow getTomorrow() {
        return tomorrow;
    }

    public Finances getFinances() {
        return finances;
    }

    public DailyCompoundingHabits getDailyCompoundingHabits() {
        return dailyCompoundingHabits;
    }

    public AppointmentsMeetings getAppointments() {
        return appointments;
    }

}
