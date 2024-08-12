package in.co.nmsworks.week2;

/**
 * . Write a program to print the Grade for given Mark.
 * Mark Slab : 91-100 = S; 81-90 = A;
 * 71-80 = B; 61-70 = C ;
 * 51-60 = D; Every thing else : F
 */

public class Te2 {
    int mark;

    public void grade() {
        if (mark <= 100 && mark >= 91) {
            System.out.println("Grade :: " + "S");
        } else if (mark <= 90 && mark >= 81) {
            System.out.println("Grade :: " + "A");
        } else if (mark <= 80 && mark >= 71) {
            System.out.println("Grade :: " + "B");
        } else if (mark <= 70 && mark >= 61) {
            System.out.println("Grade :: " + "C");
        } else if (mark <= 60 && mark >= 51) {
            System.out.println("Grade :: " + "D");
        } else {
            System.out.println("Grade :: " + "F");
        }
    }
}
