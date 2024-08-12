package in.co.nmsworks.week2;

/**
 * Given a 3 digit number, write a program to print the hundred position value in words.
 * E.g 1: Input : 542 Output : Five.
 * E.g 2: Input : 777 Output : Seven.
 */

public class TE8 {
    public String findHundredPosition(int num1){
        int count = 0 ;
        String result = "";
        for (int i = 0; i < 11; i++) {
            if (num1 >= 100){
                num1 = num1-100;
                count = count+1;
            }
            else {
                i = 11;
            }
        }
        switch (count){
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            default:
                result = "Zero";
                break;

        }
        return result;
    }
}
