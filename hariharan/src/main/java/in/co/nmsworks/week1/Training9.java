package in.co.nmsworks.week1;

import java.util.Scanner;

public class Training9 {
  public Training9(){

        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the word:\n");
        String line = sc.nextLine();

        String[] modifiedLine = line.split(" ");
        String maxLengthWord = modifiedLine[0];

        for(int i =1;i<modifiedLine.length;i++){
            if(modifiedLine[i].length() >= maxLengthWord.length()){
                maxLengthWord = modifiedLine[i];
            }
        }
        System.out.println(maxLengthWord);
    }
}
