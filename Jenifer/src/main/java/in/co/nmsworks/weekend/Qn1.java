package in.co.nmsworks.weekend;
// Write a program to print all even numbers between 601 and 700 in descending order.

public class Qn1 {
    public void printEvenNums() {
        for (int i = 700; i > 601; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
