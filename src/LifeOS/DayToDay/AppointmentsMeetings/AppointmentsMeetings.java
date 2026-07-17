package LifeOS.DayToDay.AppointmentsMeetings;

import LifeOS.DayToDay.AppointmentsMeetings.Appointments.Appointment;
import LifeOS.DayToDay.AppointmentsMeetings.Meetings.Meeting;

import java.util.ArrayList;

public class AppointmentsMeetings {

    private ArrayList<Appointment> appointments;
    private ArrayList<Meeting> meetings;

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public ArrayList<Meeting> getMeetings() {
        return meetings;
    }

    public createAppointment() {
        Scanner input = new Scanner(System.in);

        System.out.println("New appointment: ");
        String title = input.nextLine();

        System.out.println("Appointment Type (In Person or Virtual):\n1. In-Person\n2. Virtual");
        int choice = input.nextInt();

        if (choice = 1) {
            System.out.println("Street: ");
            String street = input.nextLine();

            System.out.println("City: ");
            String city = input.nextLine();

            System.out.println("State: ");
            String state = input.nextLine();

            System.out.println("ZIP: ");
            int postalCode = input.nextInt();

            Address address = new Address(street, city, state, zip);
        
        }

        System.out.println("Address Type: ");
        String type = input.nextLine();
    
        System.out.println("Appointment Time: ");
        String time = input.nextLine();

        System.out.println("Appointment Notes: ");
        String notes = input.nextLine();
    }

}
