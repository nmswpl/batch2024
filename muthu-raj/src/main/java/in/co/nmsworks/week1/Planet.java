package in.co.nmsworks.week1;

public class Planet {
    String name;
    public long population;
    protected int noOfMoons;


    public Planet() {

    }

    public Planet(String name, long population, int noOfMoons) {
        this.name = name;
        this.noOfMoons = noOfMoons;
        this.population = population;

    }

    public Planet(long population, int noOfMoons) {
        this.name = "";
        this.noOfMoons = noOfMoons;
        this.population = population;
    }

    public String habitableOrInhabitable() {
        if (population < 1) {
            return "Inhabitable";
        }

        return "Habitable";
    }

    public String colorOfPlanet() {
        if (name.equalsIgnoreCase("mercury")) {
            return "Grey";
        } else if (name.equalsIgnoreCase("venus")) {
            return "Golden brown";
        } else if (name.equalsIgnoreCase("earth")) {
            return "Blue";
        } else if (name.equalsIgnoreCase("mars")) {
            return "Red";
        } else if (name.equalsIgnoreCase("jupiter")) {
            return "Brown, Red";
        } else if (name.equalsIgnoreCase("saturn")) {
            return "Yellow, Brown";
        } else if (name.equalsIgnoreCase("uranus")) {
            return "Cyan";
        } else if (name.equalsIgnoreCase("neptune")) {
            return "Blue";
        } else
            return "Unknown Planet";
    }
}
