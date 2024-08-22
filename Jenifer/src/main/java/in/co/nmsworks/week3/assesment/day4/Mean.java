package in.co.nmsworks.week3.assesment.day4;
/* Write a program to find the mean of an array.
   The mean is the result of dividing the sum of the elements by the number of elements.
 */

public class Mean {
    public void meanOfArray(){
        int[] array = {12, 24, 53, 64, 27};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        int mean = sum / array.length;
        System.out.println("Mean : " +mean);
    }
}
