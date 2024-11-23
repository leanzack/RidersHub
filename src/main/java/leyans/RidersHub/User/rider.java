package leyans.RidersHub.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class rider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rider_id;
    private String name;
    private String ride;

    public rider() {

    }
    public rider(Integer rider_id, String name, String ride) {
        this.rider_id = rider_id;
        this.name = name;
        this.ride = ride;
    }



    public Integer getRider_id() {
        return rider_id;
    }

    public void setRider_id(Integer rider_id) {
        this.rider_id = rider_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRide() {
        return ride;
    }

    public void setRide(String ride) {
        this.ride = ride;
    }
}
