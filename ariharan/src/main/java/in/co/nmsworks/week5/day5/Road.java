package in.co.nmsworks.week5.day5;

import java.util.List;

public class Road {
    private String name;
    private List<Integer> vechicles;

    public Road( String name, List<Integer> vechicles ){
        this.name = name;
        this.vechicles = vechicles;
    }

    public String getName(){
        return name;
    }

    public void setName( String name ){
        this.name = name;
    }

    public List<Integer> getVechicles(){
        return vechicles;
    }

    public void setVechicles( List<Integer> vechicles ){
        this.vechicles = vechicles;
    }

    @Override
    public String toString(){
        return "Road{" +
                "name='" + name + '\'' +
                ", vechicles=" + vechicles +
                '}';
    }
}
