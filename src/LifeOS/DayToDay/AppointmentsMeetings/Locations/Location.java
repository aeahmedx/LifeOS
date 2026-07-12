package LifeOS.DayToDay.AppointmentsMeetings.Locations;

public class Location {

    static Address address;
    static VirtualLocation virtualLocation;

    public static VirtualLocation getVirtualLocation() {
        return virtualLocation;
    }

    public static void setVirtualLocation(VirtualLocation virtualLocation) {
        Location.virtualLocation = virtualLocation;
    }

    public static Address getAddress() {
        return address;
    }

    public static void setAddress(Address address) {
        Location.address = address;
    }
}
