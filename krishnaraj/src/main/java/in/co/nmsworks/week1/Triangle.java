package in.co.nmsworks.week1;

public class Triangle {
    int side1;
    int side2;
    int side3;

    public void area(){
        double area= 0.5*(side1*side2);
        System.out.println("The area of triangle: " +area);
    }
    public void perimeter(){
        int perimeter= side1+side2+side3;
        System.out.println("The perimeter of triangle : "+perimeter);
    }
}

