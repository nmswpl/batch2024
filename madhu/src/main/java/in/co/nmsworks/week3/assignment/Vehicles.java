package in.co.nmsworks.week3.assignment;

public class Vehicles {
    int wheels;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
     public Vehicles(int wheels,String name){
         this.wheels = wheels;
         this.name = name;
     }

}
