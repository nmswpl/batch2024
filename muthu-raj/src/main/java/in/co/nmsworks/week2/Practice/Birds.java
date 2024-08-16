package in.co.nmsworks.week2.Practice;

public class Birds extends Animal {

    private int noOfWings;


    public int getNoOfWings() {
        return noOfWings;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    public String movementType() {

        return "AIR";

    }

    public boolean makesSound() {
        return true;
    }

    public boolean canSwim() {

        return false;


    }


}
