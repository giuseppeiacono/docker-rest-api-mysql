package booking.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "room_type")
public class RoomType implements Serializable {

    private static final long serialVersionUID = 7L;

    @OneToMany
    private Room room;

    @OneToMany
    private BookedRoom bookedRoom;

    @ManyToOne
    private StandardOccupancy standardOccupancy;

    private HotelRoomType hotelRoomType;

    public RoomType(Room room, BookedRoom bookedRoom, StandardOccupancy standardOccupancy, HotelRoomType hotelRoomType) {
        this.room = room;
        this.bookedRoom = bookedRoom;
        this.standardOccupancy = standardOccupancy;
        this.hotelRoomType = hotelRoomType;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public BookedRoom getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(BookedRoom bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    public StandardOccupancy getStandardOccupancy() {
        return standardOccupancy;
    }

    public void setStandardOccupancy(StandardOccupancy standardOccupancy) {
        this.standardOccupancy = standardOccupancy;
    }

    public HotelRoomType getHotelRoomType() {
        return hotelRoomType;
    }

    public void setHotelRoomType(HotelRoomType hotelRoomType) {
        this.hotelRoomType = hotelRoomType;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "room=" + room +
                ", bookedRoom=" + bookedRoom +
                ", standardOccupancy=" + standardOccupancy +
                ", hotelRoomType=" + hotelRoomType +
                '}';
    }

    public enum HotelRoomType {
        SINGLE, DOUBLE, SUITE;
    }
}
