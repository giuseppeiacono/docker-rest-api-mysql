package booking.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "booked_room")
public class BookedRoom implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    private RoomType roomType;

    @ManyToOne
    private TrivagoBooking trivagoBooking;

    public BookedRoom(RoomType roomType, TrivagoBooking trivagoBooking) {
        this.roomType = roomType;
        this.trivagoBooking = trivagoBooking;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public TrivagoBooking getTrivagoBooking() {
        return trivagoBooking;
    }

    public void setTrivagoBooking(TrivagoBooking trivagoBooking) {
        this.trivagoBooking = trivagoBooking;
    }

    @Override
    public String toString() {
        return "BookedRoom{" +
                "roomType=" + roomType +
                ", trivagoBooking=" + trivagoBooking +
                '}';
    }
}
