package in.co.nmsworks.week2;

public class Training11 {
    public void findLargest(int a, int b, int c){
        if(a > b && a > c){
            System.out.println("Number " +a+ " is the biggest number");
        }
        else if (b > c) {
            System.out.println("Number "+b+" is the biggest number");
        }
        else {
            System.out.println("Number "+c+" is the biggest number");
        }
    }
}