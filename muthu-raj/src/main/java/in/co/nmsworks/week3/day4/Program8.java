package in.co.nmsworks.week3.day4;
/*
Problem-8: Write a program to find the mean of an array.
        The mean is the result of dividing the sum of the elements by the number of elements.
 */
public class Program8 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,10,6,7,8};
        findMean(nums);

    }

    private static void findMean(int[] nums) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("The mean of the array is " + sum / nums.length);
    }
}
