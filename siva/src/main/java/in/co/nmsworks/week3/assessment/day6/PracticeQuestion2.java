package in.co.nmsworks.week3.assessment.day6;

public class PracticeQuestion2 {
    public static void main(String[] args) {
        int num = 10;
        printFibonacci(num);
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        System.out.println("First " + n + " numbers in the Fibonacci sequence:");

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }
    }

}
