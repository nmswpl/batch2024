package in.co.nmsworks.week2;

public class Te20 {
    public int isPrime(int val){
        if(val==0){
            return -1;
        }
        else if (val==1) {
            return -1;
        }
        for (int i = 2; i <val ; i++) {
            if(val%i==0){
                return 0;
            }


        }
        return 1;
    }
}
