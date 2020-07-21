
import java.util.ArrayList;
import java.util.HashMap;


public class Station {

    int stationId;
    String location;
    Bike bikeID;


    Station (int stationId, String location){
        this.stationId = stationId;
        this.location = location;

    }


    ArrayList <Integer> test1= new ArrayList<>();

    public ArrayList<Integer> getTest1() {
        return test1;
    }


    public void addBike(int bike){

            if(test1.contains(bike)){
              System.out.println("iteration fail ");
            }else{
                if(test1.size() < 5){
                    test1.add(bike);
                    System.out.println(test1+ "bikes in station" + stationId );
                } else{
                    System.out.println(" amount fail ");
                }

            }


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
