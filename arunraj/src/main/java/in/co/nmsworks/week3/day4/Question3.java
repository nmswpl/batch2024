package in.co.nmsworks.week3.day4;

/*Write a program to find the sum
of digits of a given integer.
 */

public class Question3 {
    public static void main(String[] args) {
        Question3 q3 = new Question3();
        q3.sumOfInteger(5);
    }

    public void sumOfInteger(int num){
        int sum = 0;
        for(int i = 0 ; i <=num; i++){
            sum += i;
        }
        System.out.println("The sum of the integer is "+sum);
    }
}
