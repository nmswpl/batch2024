package in.co.nmsworks.week1;

import java.util.EnumMap;

import static in.co.nmsworks.week1.Plant.FlowerPlant.FLOWERING;

public class Test {
    int length;
    int breath;
    public int area ()
    {
        return length * breath;
    }
    public int perimeter ()
    {
        return 2 * (length + breath);
    }
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.length=10;
        rectangle1.breath =5;
        System.out.println("The rectangle1 area value= "+rectangle1.area());
        System.out.println("The rectangle1 perimeter value= "+rectangle1.perimeter());

        Rectangle rectangle2 = new Rectangle();
        rectangle2.length = 20;
        rectangle2.breath = 15;
        System.out.println("The rectangle2 area value= " +rectangle2.area());
        System.out.println("The rectangle2 perimeter value= " +rectangle2.perimeter());

        Triangle triangle1=new Triangle();
        triangle1.height=4;
        triangle1.length=2;
        triangle1.breath=3;
        System.out.println("The Triangle area value= " +triangle1.area());
        System.out.println("The Triangle perimeter value= " +triangle1.perimeter());









    }


}
