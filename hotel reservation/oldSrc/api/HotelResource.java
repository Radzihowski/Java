package api;

import java.util.Collection;
import java.util.Date;

public class HotelResource {

    private static HotelResource hotelResource;

    public static HotelResource getInstance() {
        if (hotelResource == null) {
            hotelResource = new HotelResource();
        }
        return hotelResource;
    }

    public Customer getCustomer(String email) {
        return CustomerService.getInstance().getCustomer(email);
    }

    public void createACustomer(String email, String firstName, String lastName) {
        CustomerService.getInstance().addCustomer(email, firstName, lastName);
    }

    public IRoom getRoom(String roomNumber) {
        return ReservationService.getInstance().getARoom(roomNumber);
    }

    public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate) {
        Customer customer = CustomerService.getInstance().getCustomer(customerEmail);
        if (customer == null) {
            return null;
        }
        return ReservationService.getInstance().reserveARoom(customerEmail, room, checkInDate, checkOutDate);
    }

    public Collection<Reservation> getCustomersReservations(String customerEmail) {
        Customer customer = CustomerService.getInstance().getCustomer(customerEmail);
        if (customer == null) {
            return null;
        }
        return ReservationService.getInstance().getCustomersReservation(customer);
    }

    public Collection<IRoom> findARoom(Date checkIn, Date checkOut) {
        return ReservationService.getInstance().findRooms(checkIn, checkOut);
    }
}
