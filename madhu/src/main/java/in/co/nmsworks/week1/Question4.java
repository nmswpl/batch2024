package in.co.nmsworks.week1;
/* Factorial Program in Java */
public class Question4 {
    public static void main(String[] args) {
        int i = 6;
        int j = 1;

        for (; i >= 1; i--)
           j =  i * j;
        System.out.print("factorial="  +j);
    }
}
