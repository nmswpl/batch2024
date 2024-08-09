package in.co.nmsworks.week1;

public class TestClass {
    public static void main(String[] args) {
//        Rectangle.class implementation
        System.out.println("\nRectangle Instance 1");
        Rectangle rectangle1=new Rectangle();
        rectangle1.length=10;
        rectangle1.width=5;
        System.out.println("Area of Rectangle1 : "+rectangle1.area());
        System.out.println("Perimeter of Rectangle1 : "+rectangle1.perimeter());
        System.out.println("\nRectangle Instance 1");
        Rectangle rectangle2=new Rectangle();
        rectangle2.length=20;
        rectangle2.width=15;
        System.out.println("Area of Rectangle2 : "+rectangle2.area());
        System.out.println("Perimeter of Rectangle2 : "+rectangle2.perimeter());

//        Triangle.class Implementation
        System.out.println("\nTriangle Instance 1");
        Triangle triangle1 = new Triangle();
        triangle1.length = 3;
        triangle1.breadth =3;
        triangle1.width=3;
        System.out.println("Area of Triangle1 : "+triangle1.area());
        System.out.println("Perimeter of Rectangle2 : "+triangle1.perimeter());
        System.out.println();

//        Fruits.class Implementation
        System.out.println("Fruits Instance 1");
        Fruits apple = new Fruits();
        apple.name = "Apple";
        apple.colour ="Red";
        apple.setPrice(100);
        apple.getFruitPrice();
        apple.getFruitColour();
        apple.getFruitDetails();
        System.out.println();

        System.out.println("Fruits Instance 2");
        Fruits mango = new Fruits();
        mango.colour ="Yellow";
        mango.name = "Mango";
        mango.setPrice(60);
        mango.getFruitPrice();
        mango.getFruitColour();
        mango.getFruitDetails();
        System.out.println();

        System.out.println("Fruits Instance 3");
        Fruits strawberry = new Fruits();
        strawberry.name = "Strawberry";
        strawberry.colour ="Bright Red";
        strawberry.setPrice(130);
        strawberry.getFruitPrice();
        strawberry.getFruitColour();
        strawberry.getFruitDetails();
        System.out.println();

        System.out.println("Fruits Instance 4");
        Fruits grapes = new Fruits("Grapes","green",70, Fruits.Taste.SOUR);
        grapes.getFruitPrice();
        grapes.getFruitColour();
        grapes.getFruitDetails();
        System.out.println();


        System.out.println("Fruits Instance 5");
        Fruits banana = new Fruits("Banana","Yellow ",90, Fruits.Taste.SWEET);
        banana.getFruitPrice();
        banana.getFruitColour();
        banana.getFruitDetails();

    }
}

