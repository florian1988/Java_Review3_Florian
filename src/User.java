public class User {

    int userId;
    String name;
    String surname;
    Bike bikeID;
    Station station;



    User(int userId, String name, String surname){
        this.userId = userId;
        this.name = name;
        this.surname = surname;

    }




    public void rent(int bikeId, int stationId, Bike bike1){

       System.out.println(bike1.getBikeID());
              System.out.println( bikeId + " "+ stationId);

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
