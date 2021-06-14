package api;

import java.util.Collection;
import java.util.List;

public class AdminResource {

    private static AdminResource adminResource;

    public static AdminResource getInstance() {
        if (adminResource == null) {
            adminResource = new AdminResource();
        }
        return adminResource;
    }

//    public Customer getCustomer(String email) {
//        return CustomerService.getInstance().getCustomer(email);
//    }
//
//    public void addRoom(List<IRoom> rooms) {
//        ReservationService.getInstance();
//    }

//    public Collection<IRoom> getAllRooms() {
//    }
//
//    public Collection<Customer> getAllCustomers() {
//    }

    public void displayAllReservations() {
    }
}
