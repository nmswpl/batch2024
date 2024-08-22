package in.co.nmsworks.week3.day4;

/***
 * Write a program to find the sum of digits of a given integer.
 */
public class Question4 {
  public void sumOfDigits(int number){
      int sumOfDigits=0;
      while (number !=0) {
          int lastDigit = number % 10;
          sumOfDigits += lastDigit;
          number = number / 10;
      }
      System.out.println("The sum of digits : "+sumOfDigits);
  }
    public static void main(String[] args) {
        Question4 question4 = new Question4();
        question4.sumOfDigits(2345);
    }
}
