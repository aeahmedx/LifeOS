package LifeOS.DayToDay.AppointmentsMeetings.Locations;

public class Address {

    private String street;
    private String city;
    private String state;
    private String postalCode;

    public Address(String street, String city, String state, int zip) {
        this.street = street;
        this.city = city;
        this.state = state
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
