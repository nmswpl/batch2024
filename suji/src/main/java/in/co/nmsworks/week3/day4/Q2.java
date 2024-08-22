package in.co.nmsworks.week3.day4;

public class Q2 {
    int year;

    public void check(int year) {
      this.year=year;

        if (((year % 4 == 0)&&(year%100!=0))||(year%400==0))
        {
            System.out.println(" Leap year ::" + year);
        }
         else
        {
            System.out.println(" Not a leap year ::" + year);
        }
    }

    public static void main(String[] args) {
        Q2 ob = new Q2();
        ob.check(2020);
    }
}