package in.co.nmsworks.week2;

import java.util.Scanner;

public class Training2 {
     public Training2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark:");
        int mark = sc.nextInt();

        if(mark >= 91 && mark <=100){
            System.out.println('S'+"\n");
        }else if (mark >= 81 && mark <=90){
            System.out.println('A' +"\n");
        }else if(mark >= 71 && mark <=80){
            System.out.println('B'+"\n");
        }else if(mark >= 61 && mark <=70){
            System.out.println('C'+"\n");
        } else if (mark >= 51 && mark <=60) {
            System.out.println('D' +"\n");
        }else{
            System.out.println('F'+"\n");
        }
    }
}
