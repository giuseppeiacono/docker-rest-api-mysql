package booking.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 2L;

    @OneToMany
    private TrivagoBooking trivagoBooking;

    private String name;

    private String surname;

    private String passport;

    public Customer(TrivagoBooking trivagoBooking, String name, String surname, String passport) {
        this.trivagoBooking = trivagoBooking;
        this.name = name;
        this.surname = surname;
        this.passport = passport;
    }

    public TrivagoBooking getTrivagoBooking() {
        return trivagoBooking;
    }

    public void setTrivagoBooking(TrivagoBooking trivagoBooking) {
        this.trivagoBooking = trivagoBooking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "trivagoBooking=" + trivagoBooking +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }
}
