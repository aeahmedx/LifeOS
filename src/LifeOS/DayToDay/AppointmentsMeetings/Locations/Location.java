package LifeOS.DayToDay.AppointmentsMeetings.Locations;

public class Location {

    private Address address;
    private VirtualLocation virtualLocation;

    public Location() {}

    public getAddress() {
        return address;
    }

    public getVirtualLocation() {
        return virtualLocation;
    }

      public setVirtualLocation(VirtualLocation virtualLocation) {
        this.virtualLocation = virtualLocation;
    }

    public setAddress(Address Address) {
        this.address = address;
    }

}
