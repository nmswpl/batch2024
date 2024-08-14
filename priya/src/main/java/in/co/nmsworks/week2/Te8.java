package in.co.nmsworks.week2;
/*8.Given a 3 digit number, write a program to print the hundred position value in words.
E.g 1: Input : 542 Output : Five.
        E.g 2: Input : 777 Output : Seven*/
public class Te8 {
    public void getHundredPosition(int x){
        x=x/100;
        System.out.println("The number in the hundreadth position is "+x);
    }
}
