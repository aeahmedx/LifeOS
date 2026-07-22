package LifeOS.DayToDay.AppointmentsMeetings.Locations;

public class Location {

    private Address address;
    private VirtualLocation virtualLocation;

    public Location() {
    }

    public Location(Address address) {
        this.address =  address;
    }

    public Location(VirtualLocation virtualLocation) {
        this.virtualLocation = virtualLocation;
    }

    public Address getAddress() {
        return address;
    }

    public VirtualLocation getVirtualLocation() {
        return virtualLocation;
    }

    public void setVirtualLocation(VirtualLocation virtualLocation) {
        this.virtualLocation = virtualLocation;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
