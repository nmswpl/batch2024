package in.co.nmsworks.week5.day5;

import java.util.List;

public class Vehicle {
    private List<Integer> vechicleList;

    public Vehicle() {
    }

    public Vehicle(List<Integer> vechicleCount) {
        this.vechicleList = vechicleCount;
    }

    public List<Integer> getVechicleList() {
        return vechicleList;
    }

    public void setVechicleList(List<Integer> vechicleList) {
        this.vechicleList = vechicleList;
    }
}
