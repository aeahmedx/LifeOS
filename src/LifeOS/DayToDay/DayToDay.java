package LifeOS.DayToDay;

import LifeOS.DayToDay.AppointmentsMeetings.AppointmentsMeetings;
import LifeOS.DayToDay.CompletionList.CompletionList;
import LifeOS.DayToDay.DailyCompoundingHabits.DailyCompoundingHabits;
import LifeOS.DayToDay.Finances.Finances;
import LifeOS.DayToDay.OpenLoops.OpenLoops;
import LifeOS.DayToDay.TodayTomorrow.Today.Today;
import LifeOS.DayToDay.TodayTomorrow.Tomorrow;

public class DayToDay {

    static Today today;
    static OpenLoops openLoops;
    static CompletionList completionList;
    static Tomorrow tomorrow;
    static Finances finances;
    static DailyCompoundingHabits dailyCompoundingHabits;
    static AppointmentsMeetings appointments;

    public static Today getToday() {
        return today;
    }

    public static void setToday(Today today) {
        DayToDay.today = today;
    }

    public static OpenLoops getOpenLoops() {
        return openLoops;
    }

    public static void setOpenLoops(OpenLoops openLoops) {
        DayToDay.openLoops = openLoops;
    }

    public static CompletionList getCompletionList() {
        return completionList;
    }

    public static void setCompletionList(CompletionList completionList) {
        DayToDay.completionList = completionList;
    }

    public static Tomorrow getTomorrow() {
        return tomorrow;
    }

    public static void setTomorrow(Tomorrow tomorrow) {
        DayToDay.tomorrow = tomorrow;
    }

    public static Finances getFinances() {
        return finances;
    }

    public static void setFinances(Finances finances) {
        DayToDay.finances = finances;
    }

    public static DailyCompoundingHabits getDailyCompoundingHabits() {
        return dailyCompoundingHabits;
    }

    public static void setDailyCompoundingHabits(DailyCompoundingHabits dailyCompoundingHabits) {
        DayToDay.dailyCompoundingHabits = dailyCompoundingHabits;
    }

    public static AppointmentsMeetings getAppointments() {
        return appointments;
    }

    public static void setAppointments(AppointmentsMeetings appointments) {
        DayToDay.appointments = appointments;
    }

}
