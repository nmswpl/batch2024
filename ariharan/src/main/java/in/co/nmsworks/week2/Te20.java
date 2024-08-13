package in.co.nmsworks.week2;
//Given an integer x, Write a Program to check whether x is Prime or not ?
//        E.g (1) Input: x = 7; Output: Prime E.g (2) Input: x = 10; Output: Not Prime

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
