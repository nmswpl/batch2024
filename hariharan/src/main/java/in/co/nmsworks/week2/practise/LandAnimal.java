package in.co.nmsworks.week2.practise;

public class LandAnimal extends Animal{

    public int getNoLegs() {
        return noLegs;
    }

    public void setNoLegs(int noLegs) {
        this.noLegs = noLegs;
    }

    private int noLegs;


    public boolean canRun(){
        return  true;
    }


}
