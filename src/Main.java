import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //state (which can be CanBeRented, CanNotBeRented, InService,
        // Discarded (aka so broken that the service won’t pay off)

        Bike bike1 = new Bike("red", "CanBeRented");
        Bike bike2 = new Bike("red", "CanBeRented");
        Bike bike3 = new Bike("brown", "CanBeRented");
        Bike bike4 = new Bike("green", "CanNotBeRented");
        Bike bike5 = new Bike("blue", "InService");
        Bike bike6 = new Bike("black", "Discarded");
        Bike bike7 = new Bike("white", "CanNotBeRented");
        Bike bike8 = new Bike("brown", "CanBeRented");
        Bike bike9 = new Bike("black", "CanNotBeRented");
        Bike bike10 = new Bike("", "noBikeRented");



        /*
        testing IdCounter
        bike1.print();
        bike2.print();
        bike3.print();
         */

        HashMap <Integer, String> bikes = new HashMap <Integer, String>();

        bikes.put(bike1.bikeID,bike1.state);
        bikes.put(bike2.bikeID,bike2.state);
        bikes.put(bike3.bikeID,bike3.state);
        bikes.put(bike4.bikeID,bike4.state);
        bikes.put(bike5.bikeID,bike5.state);
        bikes.put(bike6.bikeID,bike6.state);
        bikes.put(bike7.bikeID,bike7.state);
        bikes.put(bike8.bikeID,bike8.state);
        bikes.put(bike9.bikeID,bike9.state);
        bikes.put(bike10.bikeID,bike10.state);

        /*
        HashMap testing
        System.out.println(bikes.size());
        System.out.println(bikes.get(2));
         */




        Station stat1 = new Station( 1 , "innere Stadt");
        Station stat2 = new Station( 2 , "Donaustadt");
        Station stat3 = new Station( 3 , "AKH");



        HashMap <Integer, String> stations = new HashMap <Integer, String>();

        stations.put(stat1.stationId, stat1.location);
        stations.put(stat2.stationId, stat2.location);
        stations.put(stat3.stationId, stat3.location);






        /*
        HashMap testing
        System.out.println(stations.size());
        System.out.println(stations.get(2));
         */


        User user1 = new User(1, "alex", "alexej", bike10);
        User user2 = new User(2, "blex", "huber", bike10);
        User user3 = new User(3, "clex", "anton", bike10);






    }


}
