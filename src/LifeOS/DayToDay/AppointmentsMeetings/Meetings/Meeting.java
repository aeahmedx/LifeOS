package LifeOS.DayToDay.AppointmentsMeetings.Meetings;

import LifeOS.DayToDay.AppointmentsMeetings.Locations.Location;

import java.time.LocalDateTime;

public class Meeting {

    static String mttgTitle;
    static Location mttglocation;
    static LocalDateTime mttgtime;
    static String mttgNotes;

    public static String getMttgTitle() {
        return mttgTitle;
    }

    public static void setMttgTitle(String mttgTitle) {
        Meeting.mttgTitle = mttgTitle;
    }

    public static Location getMttglocation() {
        return mttglocation;
    }

    public static void setMttglocation(Location mttglocation) {
        Meeting.mttglocation = mttglocation;
    }

    public static LocalDateTime getMttgtime() {
        return mttgtime;
    }

    public static void setMttgtime(LocalDateTime mttgtime) {
        Meeting.mttgtime = mttgtime;
    }

    public static String getMttgNotes() {
        return mttgNotes;
    }

    public static void setMttgNotes(String mttgNotes) {
        Meeting.mttgNotes = mttgNotes;
    }
}
