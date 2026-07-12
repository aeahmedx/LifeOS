package LifeOS.DayToDay.AppointmentsMeetings.Appointments;

import LifeOS.DayToDay.AppointmentsMeetings.Locations.Location;

import java.time.LocalDateTime;

public class Appointment {

    static String apptTitle;
    static String meetingtype;
    static Location apptlocation;
    static LocalDateTime appttime;
    static String apptNotes;


    public static String getApptTitle() {
        return apptTitle;
    }

    public static void setApptTitle(String apptTitle) {
        Appointment.apptTitle = apptTitle;
    }

    public static String getMeetingtype() {
        return meetingtype;
    }

    public static void setMeetingtype(String meetingtype) {
        Appointment.meetingtype = meetingtype;
    }

    public static Location getApptlocation() {
        return apptlocation;
    }

    public static void setApptlocation(Location apptlocation) {
        Appointment.apptlocation = apptlocation;
    }

    public static LocalDateTime getAppttime() {
        return appttime;
    }

    public static void setAppttime(LocalDateTime appttime) {
        Appointment.appttime = appttime;
    }

    public static String getApptNotes() {
        return apptNotes;
    }

    public static void setApptNotes(String apptNotes) {
        Appointment.apptNotes = apptNotes;
    }

}
