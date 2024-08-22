package in.co.nmsworks.week3.day4;

public class Problem2 {
    public void leapYearOrNot(int year){
        if(year % 4 == 0){
            System.out.println(year+" is a Leap year");
        }
        else if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println(year+" is not a Leap year");
            }
        }
    }
}