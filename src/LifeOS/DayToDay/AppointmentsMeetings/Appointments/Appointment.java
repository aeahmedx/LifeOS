package LifeOS.DayToDay.AppointmentsMeetings.Appointments;

import LifeOS.DayToDay.AppointmentsMeetings.Locations.Location;

import java.time.LocalDateTime;

public class Appointment {

    private String apptTitle;
    private String meetingtype;
    private Location apptlocation;
    private LocalDateTime appttime;
    private String apptNotes;


    public String getApptTitle() {
        return apptTitle;
    }

    public void setApptTitle(String apptTitle) {
        this.apptTitle = apptTitle;
    }

    public String getMeetingtype() {
        return meetingtype;
    }

    public void setMeetingtype(String meetingtype) {
        this.meetingtype = meetingtype;
    }

    public Location getApptlocation() {
        return apptlocation;
    }

    public void setApptlocation(Location apptlocation) {
        this.apptlocation = apptlocation;
    }

    public LocalDateTime getAppttime() {
        return appttime;
    }

    public void setAppttime(LocalDateTime appttime) {
        this.appttime = appttime;
    }

    public String getApptNotes() {
        return apptNotes;
    }

    public void setApptNotes(String apptNotes) {
        this.apptNotes = apptNotes;
    }

}
