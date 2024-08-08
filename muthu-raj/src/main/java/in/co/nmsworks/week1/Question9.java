package in.co.nmsworks.week1;
/*
Alphabet Pattern 1 :
A
B B
C C C
D D D D
E E E E E
F F F F F F
G G G G G G G
 */
public class Question9 {

    public static void main(String[] args) {
        int A = 65;
        int limit = 7;
        for(int i = 0; i < limit;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(i+A));
            }
            System.out.println();

        }

    }

}
