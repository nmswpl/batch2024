package in.co.nmsworks.week3.Day4;

public class Q2 {
    public void isLeapYear(int year){
        if((year%4==0) &&(year%100!=0 || year%400 ==0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
