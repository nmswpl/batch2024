package in.co.nmsworks.week1;

/**
 * Alphabet Pattern 1 :
 * A
 * B B
 * C C C
 * D D D D
 * E E E E E
 * F F F F F F
 * G G G G G G G
 */

public class Question9 {
    public static void main(String[] args){
        int num=74;
        for(int i=65;i<=num;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char) i);
            }
            System.out.println(" ");
        }

    }
}
