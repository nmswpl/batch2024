package in.co.nmsworks.week2.practice;

public class Animal {
    public enum eatingType{
        HERBIVORE,
        CARNIVORE,
        OMNIVORE
    };
    private String[] eats = {};
    private int noOfLegs;
    private int noOfWings;
    public eatingType eType;
    public int getNoOfLegs() {
        return noOfLegs;
    }

    public String movementType(String type){
        return type;
    }

    public String makeSound(String sound){
        return sound;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public String[] getEats(String[] eats) {
        return eats;
    }

    public void setEats(String[] eats) {
        this.eats = eats;
    }

    public int getNoOfWings() {
        return noOfWings;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }
}