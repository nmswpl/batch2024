package in.co.nmsworks.week2;

import java.util.*;

public class runner{
    public static void main(String[] args) {
     Te1 obj1= new Te1();

        Scanner sc=new Scanner(System.in);
       int mark;
        System.out.println("Enter mark");
        mark=sc.nextInt();
        Te2 obj2=new Te2(mark);
        Te3 obj3=new Te3();

        int n;
        System.out.println("Enter n");
        n = sc.nextInt();
        Te4 obj4=new Te4(n);
        String s;
        System.out.println("Enter a character");
        s=sc.next();
        Te5 obj5=new Te5(s);

        Te6 obj6=new Te6();
        Te7 obj7=new Te7();

        int n1;
        System.out.println("Enter n1");
        n1 = sc.nextInt();
        Te8 obj8=new Te8(n1);

        Te9 obj9=new Te9();
        Te10 obj10 =new Te10();

        Te11 obj11=new Te11();
        Te12 obj12=new Te12();
        Te13 obj13=new Te13();
        Te14 obj14=new Te14();

        Te15 obj15=new Te15();

        int n2;
        System.out.print("Enter n2");
        n2=sc.nextInt();
        Te16 obj16=new Te16(n2);

        Te17 obj17=new Te17();
        Te18 obj19=new Te18(2);


        int n3;
        System.out.println("Enter n3");
        n3 = sc.nextInt();
        Te20 obj20=new Te20(n3);
    }
}