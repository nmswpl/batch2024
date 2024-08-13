package in.co.nmsworks.week2;

public class TE16 {
    public int Factorial(int num){
        int product = 1;
        for (int i = num; i > 0; i--) {
            product = product * i;
        }
        return product;
    }
}

