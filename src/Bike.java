public class Bike {

    int bikeID;
    private static int idCounter = 0;
    String color;
    String state;

    Bike( String color, String state){
        this.bikeID = idCounter++;
        this.color = color;
        this.state = state;

    }


    public int getBikeID() {
        return bikeID;
    }

    public String getColor() {
        return color;
    }

    public String getState() {
        return state;
    }

    public void setBikeID(Integer bikeID) {
        this.bikeID = bikeID;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setState(String state) {
        this.state = state;
    }



    public void print(){
        System.out.println(this.bikeID + color + state);
    }

}

