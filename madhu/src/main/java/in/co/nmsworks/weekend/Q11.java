package in.co.nmsworks.weekend;

public class Q11 {
    public void grading(int mark) {
        if (mark >= 91) {
            System.out.println("S");
        } else if (mark >= 81) {
            System.out.println("A");
        } else if (mark >= 71) {
            System.out.println("B");
        } else if (mark >= 61) {
            System.out.println("C");
        } else if (mark >= 51) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}
