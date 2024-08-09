package in.co.nmsworks.week1;

import java.util.Scanner;

public class Training5 {

    public Training5(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Paragraph\n ");
        String paragraph = sc.nextLine();

        String[] paragraphArray = paragraph.split("\\.");

        for(int i= 0;i <paragraphArray.length;i++){
            System.out.println(paragraphArray[i] + "\n");
        }
    }
}
