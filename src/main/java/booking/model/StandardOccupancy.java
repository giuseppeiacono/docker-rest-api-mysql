package booking.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "standard_occupancy")
public class StandardOccupancy implements Serializable {

    private static final long serialVersionUID = 6L;

    @OneToMany
    private RoomType roomType;

    private int adults;

    private int juniors;

    private long price;

    public StandardOccupancy(RoomType roomType, int adults, int juniors, long price) {
        this.roomType = roomType;
        this.adults = adults;
        this.juniors = juniors;
        this.price = price;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getJuniors() {
        return juniors;
    }

    public void setJuniors(int juniors) {
        this.juniors = juniors;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "StandardOccupancy{" +
                "roomType=" + roomType +
                ", adults=" + adults +
                ", juniors=" + juniors +
                ", price=" + price +
                '}';
    }
}
