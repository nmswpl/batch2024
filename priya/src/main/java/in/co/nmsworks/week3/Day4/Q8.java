package in.co.nmsworks.week3.Day4;
/*Problem-8: Write a program to find the mean of an array.
        The mean is the result of dividing the sum of the elements by the number of elements.*/
public class Q8 {
    int sum=0; int mean;
    public void getMean(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        mean = sum / arr.length;
        System.out.println("Mean is:" +mean);
    }
}
