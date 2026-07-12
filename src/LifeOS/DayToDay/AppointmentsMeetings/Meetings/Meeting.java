package LifeOS.DayToDay.AppointmentsMeetings.Meetings;

import LifeOS.DayToDay.AppointmentsMeetings.Locations.Location;

import java.time.LocalDateTime;

public class Meeting {

    private String mttgTitle;
    private Location mttglocation;
    private LocalDateTime mttgtime;
    private String mttgNotes;

    public String getMttgTitle() {
        return mttgTitle;
    }

    public void setMttgTitle(String mttgTitle) {
        this.mttgTitle = mttgTitle;
    }

    public Location getMttglocation() {
        return mttglocation;
    }

    public void setMttglocation(Location mttglocation) {
        this.mttglocation = mttglocation;
    }

    public LocalDateTime getMttgtime() {
        return mttgtime;
    }

    public void setMttgtime(LocalDateTime mttgtime) {
        this.mttgtime = mttgtime;
    }

    public String getMttgNotes() {
        return mttgNotes;
    }

    public void setMttgNotes(String mttgNotes) {
        this.mttgNotes = mttgNotes;
    }
}
