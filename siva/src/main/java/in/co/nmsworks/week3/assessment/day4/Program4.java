package in.co.nmsworks.week3.assessment.day4;

/**
 * Problem-4: Implement the algorithm to find the min and max elements in an array of integers.
 */

public class Program4 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,8,6,9};
        int min = nums[0];
        int max = Integer.MIN_VALUE;
        for (int num : nums) {

            if(num >= max){
                max = num;

            }

        }
        System.out.println("max value of array :: "+max);
        for (int num : nums) {

            if(num <= min){
                min = num;
            }

        }
        System.out.println("Min value of array :: "+min);



    }

}
