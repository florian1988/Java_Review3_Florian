
import java.util.ArrayList;
import java.util.HashMap;


public class Station {

    int stationId;
    String location;
    Bike[] bike = new Bike[10];

    Bike bikeID;



    Station (int stationId, String location){
        this.stationId = stationId;
        this.location = location;

    }

    





    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBikeID(Bike bikeID) {
        this.bikeID = bikeID;
    }


    public int getStationId() {
        return stationId;
    }

    public String getLocation() {
        return location;
    }

    public Bike getBikeID() {
        return bikeID;
    }












}
