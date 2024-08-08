package in.co.nmsworks.week1;
/*** Number Pattern 2 Program ***/
public class Question7 {
    public static void main(String args[]) {
        int n=8;
        for (int i = 1; i <= 7; i++) {
            System.out.println();
            n=n-1;
            for (int j=n; j>=1;j--){
                System.out.print(i);

            }
        }
    }
}
