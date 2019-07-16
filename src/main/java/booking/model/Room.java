package booking.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "room")
public class Room implements Serializable {

    private static final long serialVersionUID = 4;

    @ManyToOne
    private RoomType roomType;

    @ManyToOne
    private Hotel hotel;

    private int number;

    public Room(RoomType roomType, Hotel hotel, int number) {
        this.roomType = roomType;
        this.hotel = hotel;
        this.number = number;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomType=" + roomType +
                ", hotel=" + hotel +
                ", number=" + number +
                '}';
    }
}
