package LifeOS.DayToDay.AppointmentsMeetings;
import LifeOS.DayToDay.AppointmentsMeetings.Locations.Location;
import LifeOS.DayToDay.AppointmentsMeetings.Locations.Address;
import LifeOS.DayToDay.AppointmentsMeetings.Locations.VirtualLocation;
import java.time.LocalDateTime;
import java.util.Scanner;



import LifeOS.DayToDay.AppointmentsMeetings.Appointments.Appointment;
import LifeOS.DayToDay.AppointmentsMeetings.Meetings.Meeting;

import java.util.ArrayList;

public class AppointmentsMeetings {

    private ArrayList<Appointment> appointments = new ArrayList<Appointment>();;
    private ArrayList<Meeting> meetings;

        
    public AppointmentsMeetings() {
        appointments = new ArrayList<>();
        meetings = new ArrayList<>();
    }


    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public ArrayList<Meeting> getMeetings() {
        return meetings;
    }

    public void createAppointment() {

        Scanner input = new Scanner(System.in);

        System.out.println("New appointment: ");
        String title = input.nextLine();

        System.out.println("Appointment Type (In Person or Virtual):\n1. In-Person\n2. Virtual");
        int choice = input.nextInt();
        input.nextLine();

        String appttype;
        Location location;



            if (choice == 1) {
                
                appttype = "In-Person";

                System.out.println("Street: ");
                String street = input.nextLine();

                System.out.println("City: ");
                String city = input.nextLine();

                System.out.println("State: ");
                String state = input.nextLine();

                System.out.println("ZIP: ");
                int postalCode = input.nextInt();
                input.nextLine();

                Address address = new Address(street, city, state, postalCode);

                location = new Location(address);
            
            }
            else if (choice == 2) {

                appttype = "Virtual";

                System.out.println("Virtual Location: ");
                String virtual = input.nextLine();

                VirtualLocation virtualLocation = new VirtualLocation(virtual);

                location = new Location(virtualLocation);
            }
            else{
                System.out.println("Invalid Choice");
                return;
            }

            System.out.println("Appointment Time: ");
            System.out.println("Month(1-12): ");
            int month = input.nextInt();
            System.out.println("Day: ");
            int day = input.nextInt();
            System.out.println("Year: ");
            int year = input.nextInt();
            System.out.println("Hour (0-23): ");
            int hour = input.nextInt();
            
            System.out.println("Minute (0-59): ");
            int minute = input.nextInt();
            input.nextLine();
        
        LocalDateTime time = LocalDateTime.of(year, month, day, hour, minute);

        System.out.println("Appointment Notes: ");
        String notes = input.nextLine();

        Appointment appointment = new Appointment(title, appttype, location, time, notes);

        appointments.add(appointment);
    }



}
