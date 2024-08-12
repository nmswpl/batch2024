package in.co.nmsworks.week2;

public class Training20 {
    public boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}