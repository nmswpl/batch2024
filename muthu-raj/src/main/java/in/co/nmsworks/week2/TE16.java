package in.co.nmsworks.week2;

public class TE16 {

    public int fibonnaci(int n){

        if( n < 1){
            return 1;
        }

        return n*fibonnaci(n-1);

    }
}
