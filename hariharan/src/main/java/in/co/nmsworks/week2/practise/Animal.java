package in.co.nmsworks.week2.practise;

public class Animal {

    enum EatingType{
        carnivotus,
        Herbivorus,
        Omnivorus
    };

    private String movementType;


    private  String Eats[];

    private  EatingType eatingtype;




    public String[] getEats() {
        return Eats;
    }

    public void setEats(String[] eats) {
        Eats = eats;
    }



    public EatingType getEatingtype() {
        return eatingtype;
    }

    public void setEatingtype(EatingType eatingtype) {
        this.eatingtype = eatingtype;
    }



}
