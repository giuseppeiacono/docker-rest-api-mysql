package booking.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "booked_room")
public class BookedRoom implements Serializable {

    private static final long serialVersionUID = 3L;

    @ManyToOne
    private RoomType roomType;

    @ManyToOne
    private TrivagoBooking trivagoBooking;

}
