package LifeOS.DayToDay.AppointmentsMeetings;

import LifeOS.DayToDay.AppointmentsMeetings.Appointments.Appointment;
import LifeOS.DayToDay.AppointmentsMeetings.Meetings.Meeting;

import java.util.ArrayList;

public class AppointmentsMeetings {

    static ArrayList<Appointment> appointments;
    static ArrayList<Meeting> meetings;

    public static ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public static void setAppointments(ArrayList<Appointment> appointments) {
        AppointmentsMeetings.appointments = appointments;
    }

    public static ArrayList<Meeting> getMeetings() {
        return meetings;
    }

    public static void setMeetings(ArrayList<Meeting> meetings) {
        AppointmentsMeetings.meetings = meetings;
    }
}
