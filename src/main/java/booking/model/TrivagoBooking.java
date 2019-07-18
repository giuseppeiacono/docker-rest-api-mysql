package booking.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "trivago_booking")
public class TrivagoBooking implements Serializable {

    private static final long serialVersionUID = 5L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private BookedRoom bookedRoom;

    @ManyToOne
    private Customer customer;

    private LocalDate checkIn;

    private LocalDate checkOut;

    public TrivagoBooking(BookedRoom bookedRoom, Customer customer, LocalDate checkIn, LocalDate checkOut) {
        this.bookedRoom = bookedRoom;
        this.customer = customer;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public BookedRoom getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(BookedRoom bookedRoom) {
        this.bookedRoom = bookedRoom;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "TrivagoBooking{" +
                "bookedRoom=" + bookedRoom +
                ", customer=" + customer +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                '}';
    }
}
