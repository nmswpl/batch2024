package in.co.nmsworks.week3.day4;

public class Question2 {
    public Question2(int year){

        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println(year + " is a Leap year ");
        }else{
            System.out.println(year + " is a not a leap year ");
        }
    }
}
