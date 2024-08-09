package in.co.nmsworks.week1;

import javax.swing.plaf.metal.MetalBorders;
import java.util.concurrent.TransferQueue;

public class Test {
    public static void main(String[] args) {
//Rectangle
//        Rectangle rec1 = new Rectangle(10, 5);
//        System.out.println("The area of rectangle1 is " + rec1.area());
//        System.out.println("The perimeter of rectangle1 is " + rec1.perimeter());
//
//        Rectangle rec2 = new Rectangle(20, 15);
//        System.out.println("The area of rectangle2 is " + rec2.area());
//        System.out.println("The perimeter of rectangle2 is " + rec2.perimeter());
//
////Triangle
//        Triangle t1 = new Triangle(3,3,3);
//        System.out.println("The area of triangle::"+t1.area());
//        System.out.println("The perimeter of triangle::"+t1.perimeter());

//Planet
//instance1
        Planet p1 = new Planet();
        p1.name = "Earth";
        p1.population = 800000000;
        p1.noOfMoons = 1;
        System.out.println(Double.MAX_VALUE);
        System.out.println("This planet is " + p1.habitableOrInhabitable());
        System.out.println(p1.name + " is " + p1.colorOfPlanet());
        System.out.println("-----------------------------------------------------");

//instance2
        Planet p2 = new Planet("Saturn", 0, 146);
        System.out.println("This planet is " + p2.habitableOrInhabitable());
        System.out.println(p2.name + " is " + p2.colorOfPlanet());
        System.out.println("-----------------------------------------------------");

//instance3
        Planet p3 = new Planet("Jupiter", 0, 95);
        System.out.println("This planet is " + p3.habitableOrInhabitable());
        System.out.println(p3.name + " is " + p3.colorOfPlanet());
        System.out.println("-----------------------------------------------------");

//instance4
        Planet p4 = new Planet("Neptune", 0, 16);
        System.out.println("This planet is " + p4.habitableOrInhabitable());
        System.out.println(p4.name + " is " + p4.colorOfPlanet());
        System.out.println("-----------------------------------------------------");

//instance5
        Planet p5 = new Planet(0, 0);
        System.out.println("This planet is " + p5.habitableOrInhabitable());
        System.out.println(p5.name + " is " + p5.colorOfPlanet());
    }
}

