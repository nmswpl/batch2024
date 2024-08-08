package in.co.nmsworks.week1;

public class Test{
    public static void main(String[] args) {
        /*Rectangle rect1=new Rectangle();
        rect1.length=10;
        rect1.breadth=5;
        System.out.println("Area of rect 1      : "+rect1.area());
        System.out.println("Perimeter of rect 1 : "+rect1.perimeter());

        Rectangle rect2=new Rectangle();
        rect2.length=20;
        rect2.breadth=15;
        System.out.println("Area of rect 2      : "+rect2.area());
        System.out.println("Perimeter of rect 2 : "+rect2.perimeter());

        Triangle tri1=new Triangle();
        tri1.height1=3;
        tri1.base=3;
        tri1.height2=3;
        System.out.println("Area of tri1      : "+tri1.areaTriangle());
        System.out.println("Perimeter of tri1 : "+tri1.perimeterTriangle())*/

        //int a=20;
        Animal dogOb=new Animal(20);
        dogOb.animalName="Dog";
        dogOb.color="Black and Brown";
        dogOb.breed="Rotwieler";
        dogOb.age=4;
        dogOb.appearance();
        dogOb.name("Rocky");

        Animal u=new Animal(15);
        u.animalName="Cat";
        u.color="Orange";
        u.age=4;
        u.breed="Persian cat";
        u.appearance();
        u.name("Garfield");

        Animal v=new Animal();
        v.cow("Holstein-Frisien",2);

        /*Animal x=new Animal();
        x.cow("Belgian Blue",2.5);*/
    }
}


