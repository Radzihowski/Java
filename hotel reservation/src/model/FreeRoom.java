package model;

public class FreeRoom extends Room {

    public FreeRoom(String roomNumber, Double price, RoomType SINGLE, RoomType DOUBLE) {
        super(roomNumber, 0.0, SINGLE, DOUBLE);
    }

    @Override
    public boolean isFree() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
