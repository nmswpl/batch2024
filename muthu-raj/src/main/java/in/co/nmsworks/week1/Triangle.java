package in.co.nmsworks.week1;

public class Triangle {

    float side1;
    float side2;
    float side3;

    public Triangle(float s1,float s2,float s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }
    public float area(){
        return (side1*side3)/2;
    }

    public float perimeter(){
        return side1+side2+side3;
    }
}
