package in.co.nmsworks.week1;

public class Fruits {

    enum Taste {
        SWEET,
        BITTER,
        SPICY,
        SALTY,
        SOUR
    }

    protected String colour;
    public String name;
    private int price;
    Taste fruitTaste;
    Fruits() {
        this.fruitTaste = Taste.SWEET;
    }
    Fruits(String name,String colour,int price,Taste fruitTaste){
        this.colour = colour;
        this.name = name;
        this.price = price;
        this.fruitTaste  = fruitTaste;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void getFruitPrice(){
        System.out.println("Fruit Name : "+this.name+"  --->  price : "+this.price+" rs per 1 KG");
    }
    public void getFruitColour(){
        System.out.println("Fruit Name : "+this.name+"  --->  Colour : "+this.colour);
    }
    public void getFruitDetails(){
        System.out.println("Fruit Name : "+this.name+"  --->  Colour : "+this.colour+"--->  Taste : "+fruitTaste);
    }
}
