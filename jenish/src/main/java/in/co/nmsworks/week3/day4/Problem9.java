package in.co.nmsworks.week3.day4;

public class Problem9 {
    public void findMedian(int[] numbers) {
        int midVal = numbers.length / 2;
        if (numbers.length % 2 != 0)
        {
            System.out.println("The median of the array is " + numbers[midVal]);
        } else
        {
            int median = (numbers[midVal] + numbers[midVal + 1]) / 2;
            System.out.println("The median of the array is " + median);
        }
    }
}