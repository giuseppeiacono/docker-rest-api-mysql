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

}
