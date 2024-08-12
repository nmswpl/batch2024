package in.co.nmsworks.week2;

/*Write a program to print the Grade for given Mark.
Mark Slab : 91-100 = S;
81-90 = A;
71-80 = B;
61-70 = C ;
51-60 = D;
Every thing else : F*/

public class Te2 {
    public void grade(int n){
        if(n>80 && n<=90){
            System.out.println("Grade : A");
        }
        else if (n>70 && n<=80){
            System.out.println("Grade : B");
        }
        else if (n>60 && n<=70){
            System.out.println("Grade : C");
        }
        else if (n>50 && n<=60) {
            System.out.println("Grade : D");

        }
        else {
            System.out.println("Grade : F");
        }
    }
}
