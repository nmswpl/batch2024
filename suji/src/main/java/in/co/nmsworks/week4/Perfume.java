package in.co.nmsworks.week4;

public class Perfume
{
    private String name;
    private String flavour;
    private float price;
    private String country;

    public Perfume() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Perfume{" +
                "name='" + name + '\'' +
                ", flavour='" + flavour + '\'' +
                ", price=" + price +
                ", country='" + country + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public int getPrice()
    {
        return (int) price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Perfume(String name, String flavour, float price, String country) {
        this.name = name;
        this.flavour = flavour;
        this.price = price;
        this.country = country;
    }
}
