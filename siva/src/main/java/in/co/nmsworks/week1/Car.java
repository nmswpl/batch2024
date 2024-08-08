package in.co.nmsworks.week1;

public class Car {
    String name;
    int price;
    float mileage;


    public Car(int price,String name,float mileage)
    {
        this.price=price;
        this.name=name;
        this.mileage=mileage;
    }



    public String carType()
    {
        if (mileage<10)
            return "super car";
        else
            return "normal car";
    }
    public String pricelevel()
    {
        if(price>50000000)
            return "costly";
        else
            return "butget";
    }
    public String carName()
    {
        return name;
    }
}
