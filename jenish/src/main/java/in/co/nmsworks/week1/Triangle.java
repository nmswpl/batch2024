package in.co.nmsworks.week1;

public class Triangle {
    int side1;
    int side2;
    int side3;
    int base;
    int height;

    public float area(){
        return (float)(base*height) / 2;
    }

    public int perimeter(){
        return side1 + side2 + side3;
    }
}