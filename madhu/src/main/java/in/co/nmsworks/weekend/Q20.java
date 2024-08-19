package in.co.nmsworks.weekend;

public class Q20 {
    public void largestNum(int x, int y,int z){
        if(x > y && x > z)
        {
            System.out.println("x is largest");
        }
        else if (y > z)
        {
            System.out.println("y is largest");
        }
        else {
            System.out.println("z is largest");
        }
    }
}
