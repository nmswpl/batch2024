package in.co.nmsworks.week2;

/**
 * .Given a 3 digit number, write a program to print the hundred position value in words.
 * E.g 1: Input : 542 Output : Five.
 * E.g 2: Input : 777 Output : Seven.
 */
public class Te8 {
    int a;

    public void hundredPosition(){
        while(a>=0){
            a/=100;
            System.out.println("The Position ::"+a);
            a++;

        }
    }
}
