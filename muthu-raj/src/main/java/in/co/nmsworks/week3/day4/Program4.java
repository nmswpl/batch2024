package in.co.nmsworks.week3.day4;



/*
Problem-4: Implement the algorithm to find the min and max elements in an array of integers.
 */
public class Program4 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};

        findMinAndMax(nums);

    }

    private static void findMinAndMax(int[] nums) {

        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int num : nums) {

            if ( num > maxi){
                maxi = num;
            }
            if(num < mini){
                mini = num;
            }
        }

        System.out.println("The largest element in the array is " + maxi);
        System.out.println("The smallest element in the array is " + mini);
    }


}
