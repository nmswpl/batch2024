package in.co.nmsworks.week3.assessment.day4;

/**
 * Problem-5: Write a program to find the second largest number in an array.
 */

public class Program5 {
    public static void main(String[] args) {
        int[] nums = {12,22,32,42,52};
        int max = 0;
        int secondmax = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max) {
                secondmax = max;
                max = nums[i];
            }
            else if (nums[i]>secondmax && nums[i]<max) {
                secondmax = nums[i];

            }

        }
        System.out.println("Second largest num :: "+secondmax);

    }
}
