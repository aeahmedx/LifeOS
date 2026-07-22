package LifeOS.DayToDay.AppointmentsMeetings.Appointments;

import LifeOS.DayToDay.AppointmentsMeetings.Locations.Location;

import java.time.LocalDateTime;

public class Appointment {

    private String apptTitle;
    private String appttype;
    private Location apptlocation;
    private LocalDateTime appttime;
    private String apptNotes;

    public Appointment(String apptTitle, String appttype, Location apptlocation, LocalDateTime appttime, String apptNotes) {
        this.apptTitle = apptTitle;
        this.appttype = appttype;
        this.apptlocation = apptlocation;
        this.appttime = appttime;
        this.apptNotes = apptNotes;
    }


    public String getApptTitle() {
        return apptTitle;
    }

    public void setApptTitle(String apptTitle) {
        this.apptTitle = apptTitle;
    }

    public String getMeetingtype() {
        return appttype;
    }

    public void setMeetingtype(String meetingtype) {
        this.appttype = meetingtype;
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
