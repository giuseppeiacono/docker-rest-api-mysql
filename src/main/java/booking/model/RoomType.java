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
}
