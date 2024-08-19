package in.co.nmsworks.weekend;

public class Q25 {
    public void factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
            System.out.println(fact);
        }
    }
}
