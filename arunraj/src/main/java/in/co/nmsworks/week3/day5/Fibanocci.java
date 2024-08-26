package in.co.nmsworks.week3.day5;

public class Fibanocci {
    public static void main(String[] args) {
        Fibanocci fib = new Fibanocci();
        fib.fibanocciNumbers(6);
    }
    public void fibanocciNumbers(int n){
        int a = 0;
        int fibanocci = 0;
        for (int i=1;i<=n;i++){
            fibanocci = a + i;
            a = i;
        }
        System.out.println(fibanocci);
    }
}
