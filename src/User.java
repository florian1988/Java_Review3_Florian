import java.util.HashMap;

public class User {

    int userId;
    private static int idCounter = 1;
    String name;
    String surname;

    User( String name, String surname){
        this.userId = idCounter++;
        this.name = name;
        this.surname = surname;

    }

    public void print(){
        System.out.println(userId + name + surname);
    }

    HashMap <Integer, Integer> bikeMap = new HashMap <Integer, Integer>();


    public void rentBike(int bikeId, int stationId){

        bikeMap.put(bikeId, stationId);
        System.out.print(1);

        System.out.println( "User: " + name + " " + surname + " rents a bike with the ID: " + bikeId + " from Station Id: " +stationId );

       //System.out.println( "hash size" + bike.size());
    }

    public void returnBike(int bikeId, int stationId){

        if (bikeMap.containsKey(bikeId)){
            bikeMap.remove(bikeId, stationId);
            System.out.println("User: " + name + " " + surname + " returns bike with Id: " + bikeId);
        }

        //System.out.println( "hash size" + bikeMap.size());
    }




    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }



    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
