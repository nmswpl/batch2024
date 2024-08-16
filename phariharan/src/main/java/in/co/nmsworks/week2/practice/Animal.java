package in.co.nmsworks.week2.practice;

public class Animal {

    enum EatingType {
        CARNIVORES,
        HERBIVORES,
        OMNIVORES
    }


    protected String eatTypes ;
    private String[] eats;

    public String getEatTypes() {
        return eatTypes;
    }

    public void setEatTypes(String eatTypes) {
        this.eatTypes = eatTypes;
    }
    public String movementType(){
        return "";
    }
    public String makeSound(){
        return "";
    }

    public String[] getEats() {
        return eats;
    }

    public void setEats(String[] eats) {
        this.eats = eats;
    }
}
