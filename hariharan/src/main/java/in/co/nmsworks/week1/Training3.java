package in.co.nmsworks.week1;

import java.util.Scanner;

public class Training3 {

    public Training3() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Line");
        String line = sc.nextLine();

        String[] splitedWords = line.split(" ");

        for(int i =0; i<splitedWords.length;i++){
            if(splitedWords[i].length() % 2 ==0){
                System.out.println(splitedWords[i]+ " "+"\n");
            }
        }
    }
}
