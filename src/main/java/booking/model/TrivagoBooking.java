package booking.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "trivago_booking")
public class TrivagoBooking implements Serializable {

    private static final long serialVersionUID = 5L;

    @OneToMany
    private BookedRoom bookedRoom;

    @ManyToOne
    private Customer customer;
}
