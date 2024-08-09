package in.co.nmsworks.week1;


public class Test {
    public static void main(String[] args) {

        // Rectangle Class Program

        Rectangle rectangleClass1 = new Rectangle();
        rectangleClass1.length = 10;
         rectangleClass1.breadth = 5;
        Rectangle rectangleClass2 = new Rectangle();
        rectangleClass2.length = 20;
        rectangleClass2.breadth = 15;

        System.out.println("Area: " + rectangleClass2.area()+" "+"Perimeter: " + rectangleClass2.perimeter());

        System.out.println("Area: "+rectangleClass1.area()+ " "+"Perimeter: "+ rectangleClass1.perimeter());

        // Triangle Class Program

        Triangele triangleClass = new Triangele();
        triangleClass.length = 10;
        triangleClass.height = 6;
        triangleClass.side1 = 6;
        triangleClass.side2 = 7;
        triangleClass.side3 = 3;

        System.out.println("Area: " + triangleClass.area()+" "+"Perimeter: " + triangleClass.perimeter()+"\n");

        // Laptop Class program 1

        Laptop laptopClassProgram = new Laptop();

        laptopClassProgram.brand = "MSI";
        laptopClassProgram.price = 140000;
        laptopClassProgram.ram = 8;
        laptopClassProgram.gCard = Laptop.graphicsCard.Nvidia_GeForce;
        System.out.println("Category: " + laptopClassProgram.category());
        System.out.println("Work type: " + laptopClassProgram.gaming()+"\n");

        // Laptop Class program 2

        Laptop laptopClassProgram2 = new Laptop();
        laptopClassProgram2.brand = "HP";
        laptopClassProgram2.price = 80000;
        laptopClassProgram2.ram = 16;
        laptopClassProgram2.gCard = Laptop.graphicsCard.AMD_Radeon;
        System.out.println("Category: " + laptopClassProgram2.category());
        System.out.println("Work type: " + laptopClassProgram2.gaming()+"\n");

        // Laptop Class program 3

        Laptop laptopClassProgram3 = new Laptop();
        laptopClassProgram3.brand = "Dell";
        laptopClassProgram3.price = 40000;
        laptopClassProgram3.ram = 4;
        laptopClassProgram3.gCard = Laptop.graphicsCard.AMD_Radeon;
        System.out.println("Category: "+laptopClassProgram3.category());
        System.out.println("Work type: "+laptopClassProgram3.gaming()+"\n");

        //Laptop Class Program 4

        Laptop laptopClassProgram4 = new Laptop("Lenovo", 8, 85000 , Laptop.graphicsCard.Nvidia_GeForce);
        System.out.println("Category: "+laptopClassProgram4.category());
        System.out.println("Work type: "+laptopClassProgram4.gaming()+"\n");

        //Laptop Class Program 5

        Laptop laptopClassProgram5 = new Laptop("Asus", 16, 100000, Laptop.graphicsCard.Intel);
        System.out.println("Category: "+laptopClassProgram5.category());
        System.out.println("Work type: "+laptopClassProgram5.gaming()+"\n");

        String s = "Sanjeev-kumar";
        System.out.println(s.substring(s.indexOf("-")+1));


    }
}
