package service;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ReservationService {

    private static ReservationService reservationService;
    public Collection<Reservation> reservations = new ArrayList<>();
    public Collection<IRoom> rooms = new ArrayList<>();

    // private constructor to facilitate the Singleton Pattern
    private ReservationService() {
    }

    //static reference for CustomerService class
    public static ReservationService getInstance() {
        if (null == reservationService) {
            reservationService = new ReservationService();
        }
        return reservationService;
    }

    // method to add rooms to Collection<IRoom> rooms
    public void addRoom(IRoom room) {
        rooms.add(room);
    }

    //method that should return roomId if roomId is available
    public IRoom getARoom(String roomId) {
        for (IRoom room : rooms) {
            if (roomId.equals(room.getRoomNumber())) {
                return room;
            }
        }
        return null;
    }

    public Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkoutDate) {
        Reservation reservedRooms = new Reservation(customer, room, checkInDate, checkoutDate);
        reservations.add(reservedRooms);
        return reservedRooms;
    }

    public Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        for (IRoom room : rooms) {
            if (checkInDate.after(checkInDate) && checkOutDate.before(checkOutDate)) {
                Iterator<IRoom> iRoomIterator = rooms.iterator();
                while (iRoomIterator.hasNext()) {
                    System.out.println(iRoomIterator.next());
                }
                return rooms;
            }
        }
        return null;
    }

    public void printAllReservation() {
        for (Reservation reservation : reservations) {
            System.out.println(reservations);
        }
    }

    public Collection<Reservation> getCustomersReservation(Customer customer) {
        CustomerService.getInstance().getCustomer(customer.getEmail());
        return reservations;
    }



}
