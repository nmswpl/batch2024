package in.co.nmsworks.week1;

import java.util.Scanner;

public class Training6 {

  public Training6(){

        int vowelCount = 0;
        int constantCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Line: \n");
        String line = sc.nextLine();

        String modifiedLine = line.replaceAll("[^a-zA-Z0-9]", "").replaceAll("\\d", "").toLowerCase();

        for(int i =0; i<modifiedLine.length();i++){
            if(modifiedLine.charAt(i)== 'a' || modifiedLine.charAt(i) == 'e' || modifiedLine.charAt(i) == 'i'|| modifiedLine.charAt(i) == 'o'|| modifiedLine.charAt(i) == 'u'){
                vowelCount++;
            }else{
                constantCount++;
            }
        }

        System.out.println("Vowels:" + vowelCount + " constants: "+ constantCount);
    }
}
