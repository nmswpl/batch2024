package in.co.nmsworks.week2;

/***
 * Write a program to print the Grade for given Mark.
 * Mark Slab : 91-100 = S; 81-90 = A;
 * 71-80 = B; 61-70 = C ;
 * 51-60 = D; Every thing else : F
 */
public class Te2 {
    public void Grade(int Mark){
        if(Mark>=91){
            System.out.println("S");
        } else if (Mark>=81 && Mark<=90) {
            System.out.println("A");
        } else if (Mark>=71 && Mark<=80) {
            System.out.println("B");
        }else if (Mark>=61 && Mark<=70) {
            System.out.println("C");
        }else if (Mark>=51 && Mark<=60) {
            System.out.println("D");
        }else{
            System.out.println("Fail");
        }
    }
}
