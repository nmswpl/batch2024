package in.co.nmsworks.week4.day4;

public class Fibanocci {
    public static void main(String[] args) {
        Fibanocci f = new Fibanocci();
        f.fibanocci(8);
    }

    public void fibanocci(int n) {
        int a = 0;
        int b = 1;
        int fib;
        for (int i = 0; i < n; i++) {
            fib = a;
            a = b;
            b = fib + a;
            System.out.println(fib);
        }
    }

    public int fiba(int n){
        if(n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else
            return 0;
    }
}
