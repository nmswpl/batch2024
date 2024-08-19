package in.co.nmsworks.week3.assesment;

public class Vehicle {
    private String vehicleName ;
    private Integer wheelCount ;

    public Vehicle(String vehicleName, Integer wheelCount) {
        this.vehicleName = vehicleName;
        this.wheelCount = wheelCount;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Integer getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(Integer wheelCount) {
        this.wheelCount = wheelCount;
    }
}

