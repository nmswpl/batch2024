package in.co.nmsworks.week1;


import java.util.Scanner;

public class Training1 {

        public Training1(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Line \n");
            String line = sc.nextLine();

        String s[] = line.split(" ");
        for(int i = s.length-1;i >=0; i--) {
            System.out.print(s[i] + " ");
        }
            System.out.println("\n");
    }
}
