package in.co.nmsworks.week1;

public class Triangle {
    int length;
    int breadth;
    int width;

    public float area(){
        return (float) length*breadth/2;
    }
    public int perimeter(){
        return length+breadth+width;
    }
}
