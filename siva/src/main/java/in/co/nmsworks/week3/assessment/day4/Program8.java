package in.co.nmsworks.week3.assessment.day4;

/**
 * Problem-8: Write a program to find the mean of an array.
 *         The mean is the result of dividing the sum of the elements by the number of elements.
 */
public class Program8 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,6,8,10};
        int sum =0;
        int average = 1;
        for (int num : nums) {
            sum+=num;


        }
        average = sum/ nums.length;
        System.out.println("Avearge :: "+average);

    }
}
