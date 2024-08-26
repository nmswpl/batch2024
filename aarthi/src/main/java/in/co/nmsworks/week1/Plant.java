package in.co.nmsworks.week1;

public class Plant {

    public enum FlowerPlant {
        FLOWERING,
        NOTFLOWERING
    }

    String name;
    String height;
    FlowerPlant fplant;


    public Plant()
    {

    }
    public Plant(String name, String height,FlowerPlant fplant)
    {
        this.name = name;
        this.height = height;
        this.fplant = fplant;
    }
    public String name()
    {
        return name;
    }
    public String height()
    {
        return height;
    }
    public FlowerPlant fplant()
    {
      return fplant;
    }
}
