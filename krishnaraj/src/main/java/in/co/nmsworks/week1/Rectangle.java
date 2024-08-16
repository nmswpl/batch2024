package in.co.nmsworks.week1;

public class Rectangle {
    int length;
    int breath;

    public void area(){
        int area= length*breath;
        System.out.println("The area : " +area);
    }
    public void perimeter(){
        int perimeter= (length*2)+(2*breath);
        System.out.println("The perimeter : "+perimeter);
    }
}


