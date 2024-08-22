package in.co.nmsworks.week3.assesment.day4;

public class LeapYear {
    public void leap(int year){
        if (year % 400 == 0){
            System.out.println(year + " is leap year");
        }else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is leap year");
        }else {
            System.out.println(year + " is not a leap yeap");
        }
    }
}
