import java.util.ArrayList;

public class Station {

    int stationId;
    String location;
    Bike bikeID;


    Station (int stationId, String location){
        this.stationId = stationId;
        this.location = location;

    }


    ArrayList <Integer> test1= new ArrayList<>();

    public void addBike(int bike) {

        if (test1.contains(bike)) {
            System.out.println("iteration fail ");
        } else {
            if (test1.size() < 5) {
                test1.add(bike);
                System.out.println(test1 + "bikes in station" + stationId );
            } else {
                System.out.println(" amount fail ");
            }

        }

    }

    public void userReturn(int bikeId , int userId){
        if (test1.contains(bikeId)) {
            System.out.println("iteration fail ");
        } else {
            if (test1.size() < 5) {
                test1.add(bikeId);
                System.out.println("User Id: " + userId + " returns bike Id:" + bikeId);
                System.out.println(test1 + "bikes in station" + stationId );
            } else {
                System.out.println(" amount fail ");
            }

        }

    }



    public void removeBike(int bikeid){

       int index =  test1.indexOf(bikeid);

        if( test1.contains(bikeid)){
            test1.remove(index);
            System.out.println("Bike " + bikeid + " is removed from station " + stationId+ "\n");
        }else{

            System.out.println("This bike is not here!"+ "\n");
        }
        System.out.println("bikes in station: " + test1+ "\n");
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
