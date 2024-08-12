package in.co.nmsworks.week2;
//Write a program to print the Grade for given Mark.
//Mark Slab : 91-100 = S;
//81-90 = A;
//71-80 = B;
//61-70 = C ;
//51-60 = D;
//Every thing else : F

import java.util.Scanner;

public class Test2 {
    public void grade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks:");
        int mark=sc.nextInt();
        if(mark<=100 &&mark>90){
            System.out.println("your grade is S");
        }
        else if(mark<=90 &&mark>80){
            System.out.println("your grade is A");
        }
        else if(mark<=80 &&mark>70){
            System.out.println("your grade is B");
        }
        else if(mark<=70 &&mark>60){
            System.out.println("your grade is C");
        }
        else if(mark<=60 &&mark>50){
            System.out.println("your grade is D");
        }
        else {
            System.out.println("your grade is F it means Fail");
        }
    }
}
