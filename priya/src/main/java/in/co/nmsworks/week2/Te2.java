package in.co.nmsworks.week2;
/*2. Write a program to print the Grade for given Mark.
Mark Slab : 91-100 = S;
81-90 = A;
71-80 = B;
61-70 = C ;
51-60 = D;
Every thing else : F*/
public class Te2 {
    public void getGrade(int mark) {
        if (mark >= 51 && mark <= 60) {
            System.out.println("Grade is D");}
        else if (mark >= 61 && mark <=70) {
            System.out.println("Grade is C");}
        else if (mark >= 71 && mark <= 80) {
            System.out.println("Grade is B");}
        else if (mark >= 81 && mark <= 90) {
            System.out.println("Grade is A");}
        else if(mark>=91 && mark<=100){
            System.out.println("Grade is S");}
        else {
            System.out.println("Grade is F");
        }


        }
    }



