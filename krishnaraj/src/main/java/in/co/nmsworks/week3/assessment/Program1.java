package in.co.nmsworks.week3.assessment;

/***
 * Add the Following Vehicles to a Collection.
 * 	Car, Bike, Bus, Cycle, Plane, Jeep, Ship, Auto, Boat, Helicopter.
 *    Iterate the collection, If it has 2 wheels, print "<Vehicle Name> is a Two Wheeler".
 */
public class Program1 {
    private String vehicle_name;
    private Integer numOfWeels;

    public Program1() {
    }

    public Program1(String vehicle_name, Integer numOfWeels) {
        this.vehicle_name = vehicle_name;
        this.numOfWeels = numOfWeels;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

    public Integer getNumOfWeels() {
        return numOfWeels;
    }

    public void setNumOfWeels(Integer numOfWeels) {
        this.numOfWeels = numOfWeels;
    }
}
