package model;

import java.util.Date;

public class Reservation {
    Customer customer;
    IRoom room;
    Date checkInDate;
    Date checkOutDate;

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkoutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkoutDate;
    }

    @Override
    public String toString() {
        return customer + " " + room + " " + " " + checkInDate + " " + checkOutDate;
    }
}
