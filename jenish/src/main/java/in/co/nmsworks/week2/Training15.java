package in.co.nmsworks.week2;

public class Training15 {
    public int fact(int num) {
        int res = 1;
        res *= num;
        return fact(num - 1);
    }
}

