package model;

public class Room implements IRoom {

    private String roomNumber;
    private Double price;
    RoomType enumeration;

    @Override
    public String getRoomNumber() {
        return null;
    }

    @Override
    public Double getRoomPrice() {
        return null;
    }

    @Override
    public RoomType getRoomType() {
        return null;
    }

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return roomNumber + " " + price + " " + enumeration + " " + isFree();
    }
}
