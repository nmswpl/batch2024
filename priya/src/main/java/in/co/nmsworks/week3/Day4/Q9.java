package in.co.nmsworks.week3.Day4;
/*Problem-9: Write a program to find the median of an array.
        If the number of elements is odd, the median is the middle element.
        If the number of elements is even, the median is the average of the two middle elements.*/
public class Q9 {
    public void getMean2(int... arr){
        int length = arr.length;
        int mean;
        if(length%2!=0){
            mean = arr[length/2];
        }
        else {
            mean = (arr[length/2]+ arr[length/2-1])/2;
        }
        System.out.println("Mean is "+mean);
    }
}
