package in.co.nmsworks.week1;

public class Laptop {


    enum graphicsCard{
        AMD_Radeon,
        Nvidia_GeForce,
        Intel
    };

    String brand;
    int ram;
    int price;
    protected graphicsCard gCard;

    public Laptop(){

    }


    public Laptop(String brand, int ram, int price, graphicsCard gCard){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
        this.gCard = gCard;

    }

    public String category(){

        if(price > 100000)
            return "Costly";
        else
            return "Budget";

    };

    public String gaming(){
        if(ram >= 8  && (gCard.equals(graphicsCard.AMD_Radeon) || gCard.equals(graphicsCard.Nvidia_GeForce) ))
            return "Gaming Laptop";
        else
            return "Basic works";
    }



}
