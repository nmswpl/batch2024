package in.co.nmsworks.week2.practise;

public class Bird extends Animal {
    int noWings;

    public int getNoLegs() {
        return noLegs;
    }

    public void setNoLegs(int noLegs) {
        this.noLegs = noLegs;
    }

    int noLegs;

    public int getNoWings() {
        return noWings;
    }

    public void setNoWings(int noWings) {
        this.noWings = noWings;
    }

    public boolean canfly(){
       return true;
    }


}
